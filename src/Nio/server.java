package Nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.charset.Charset;
import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.Set;

public class server {
    public static void main(String[] args) throws IOException {
        Selector selector = Selector.open();
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.socket().bind(new InetSocketAddress(8000));
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        for (; ; ) {
            if (selector.select(1000) == 0) { //没有事件发生
                System.out.println("服务器等待了1秒，无连接");
                continue;
            }
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator iterator = selectionKeys.iterator();
            while (iterator.hasNext()) {
                SelectionKey selectionKey = (SelectionKey) iterator.next();
                if (selectionKey.isAcceptable()) {
                    SocketChannel socketChannel = serverSocketChannel.accept();
                    System.out.println("123");
                    socketChannel.configureBlocking(false);
                    socketChannel.register(selector, SelectionKey.OP_READ);
                    socketChannel.write(Charset.forName("UTF-8").encode("欢迎进入聊天室"));
                    System.out.println("start");

                }
                if (selectionKey.isReadable()) {
                    SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
                    System.out.println("正在读取..............");
                    ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                    socketChannel.configureBlocking(false);
                    String content = "";
                    while (socketChannel.read(byteBuffer) > 0) {
                        byteBuffer.flip();
                        content += Charset.forName("UTF-8").decode(byteBuffer);
                    }
                    socketChannel.register(selector, SelectionKey.OP_READ);
                    broadHandler(selector, socketChannel, content);
                }
                iterator.remove();
            }
        }
    }
        static  void broadHandler(Selector selector,SocketChannel socketChannel,String content)
    {
        Set<SelectionKey> selectionKeys=selector.selectedKeys();
        selectionKeys.forEach(selectionKey -> {
            Channel channel=selectionKey.channel();
            if (channel instanceof SocketChannel && channel!=socketChannel)
            {
                try {
                    ((SocketChannel) channel).write(Charset.forName("UTF-8").encode(content));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

    }
}
