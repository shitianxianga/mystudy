package Nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.Iterator;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/13 9:08
 * @updateDate 2021/4/13 9:08
 **/
public class ReactorServer implements Runnable {
    private ServerSocketChannel serverSocketChannel;
    private Selector selector;
    private int port;
    private  void open() throws IOException {
        serverSocketChannel.bind(new InetSocketAddress(port));
        serverSocketChannel.configureBlocking(false);
       SelectionKey sk= serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
       sk.attach(new Accepetor(serverSocketChannel,selector));
    }

    public ReactorServer(int port) throws IOException {
        this.serverSocketChannel = ServerSocketChannel.open();
        this.selector = Selector.open();
        this.port=port;
    }

    @Override
    public void run() {
        try {
            open();
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (true)
        {
            try {
                selector.select();
                Iterator<SelectionKey> iterator=selector.selectedKeys().iterator();
                while (iterator.hasNext())
                {
                    SelectionKey key=iterator.next();
                    dispatch(key);
                    iterator.remove();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    private void dispatch(SelectionKey key) {
        Runnable runnable= (Runnable) key.attachment();
        if (runnable!=null)
        {
            runnable.run();
        }
    }

    public static void main(String[] args) throws IOException {
        ReactorServer server=new ReactorServer(8080);
       Thread thread=  new Thread( new FormatInfo());
        thread.start();
       server.run();

    }
}
