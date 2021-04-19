package Nio;

import java.io.IOException;
import java.net.Socket;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/13 9:13
 * @updateDate 2021/4/13 9:13
 **/
public class Accepetor implements Runnable {
   private ServerSocketChannel channel;
   private Selector selector;
    public Accepetor(ServerSocketChannel serverSocketChannel,Selector selector) {
        channel=serverSocketChannel;
        this.selector=selector;
    }

    @Override
    public void run() {
        try {
            SocketChannel client=channel.accept();
            System.out.println("建立新的连接 :"+client.getRemoteAddress());
            client.configureBlocking(false);
            SelectionKey sk= client.register(selector, SelectionKey.OP_READ);
            sk.attach(new MyHandler(client,sk));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
