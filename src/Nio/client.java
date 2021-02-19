package Nio;

import sun.reflect.generics.tree.Tree;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class client {
    public static void main(String[] args) throws IOException {
        SocketChannel socketChannel=SocketChannel.open();
       InetSocketAddress address= new InetSocketAddress("127.0.0.1",8000);
        socketChannel.configureBlocking(false);
        Selector selector=Selector.open();
        socketChannel.register(selector, SelectionKey.OP_READ);
        if (!socketChannel.connect(address))
        {
            while (!socketChannel.finishConnect()) {
                System.out.println("因为连接需要时间，客户端不会阻塞，可以做其它工作..");
            }
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (;;) {
                    Set<SelectionKey> selectionKeys = selector.selectedKeys();
                    Iterator iterator=selectionKeys.iterator();
                    while (iterator.hasNext())
                    {
                        SelectionKey selectionKey= (SelectionKey) iterator.next();
                        if (selectionKey.isReadable())
                        {
                            try {
                                handel(selectionKey,selector);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }

            }
        }
        ).start();
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextLine())
        {
            String content=scanner.nextLine();
            socketChannel.write(Charset.forName("UTF-8").encode(content));

        }


    }
    static void handel(SelectionKey selectionKey,Selector selector) throws IOException {
        SocketChannel socketChannel= (SocketChannel) selectionKey.channel();
        ByteBuffer byteBuffer=ByteBuffer.allocate(1024);
        String response="";
        while (socketChannel.read(byteBuffer)>0)
        {
            byteBuffer.flip();
                response+=Charset.forName("UTF-8").decode(byteBuffer);
        }
        socketChannel.configureBlocking(false);
        socketChannel.register(selector,SelectionKey.OP_READ);
        while (response.length()>0)
        {
            System.out.println(response);
        }
    }

}
