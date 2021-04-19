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
    static    SocketChannel socketChannel=null;
    public static void main(String[] args) throws IOException {
       socketChannel =SocketChannel.open();
       InetSocketAddress address= new InetSocketAddress("127.0.0.1",8080);
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

                    try {
                        handel();
                    } catch (IOException e) {
                        e.printStackTrace();
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
    static void handel() throws IOException {
        ByteBuffer byteBuffer=ByteBuffer.allocate(1024);
        String response="";
        if (socketChannel.read(byteBuffer)>0)
        {
            byteBuffer.flip();
            byte[] bytes=new byte[byteBuffer.limit()];
            byteBuffer.get(bytes);
            response+=new String(bytes);
        }
        System.out.println(response);

    }

}
