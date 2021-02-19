package Nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class Reactor implements  Runnable {
    private Selector selector;
    private ServerSocketChannel serverSocketChannel;

    public Reactor(int port) throws IOException {
        selector=Selector.open();
        serverSocketChannel=ServerSocketChannel.open();
        serverSocketChannel.bind(new InetSocketAddress(port));
        serverSocketChannel.configureBlocking(false);
       SelectionKey sk= serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

    }

    @Override
    public void run()
    {
        while (true)
        {
            Set set=selector.selectedKeys();
            Iterator iterator=set.iterator();
            while (iterator.hasNext())
            {
                SelectionKey sk= (SelectionKey) iterator.next();
                dispatch(sk);

            }
        }
    }
    public void dispatch(SelectionKey sk)
    {
        Runnable runnable= (Runnable) sk.attachment();
        if (runnable!=null)
        {
            runnable.run();
        }
    }
    class   Acceptor{
        public synchronized  void  run() throws IOException {
            SocketChannel socketChannel=serverSocketChannel.accept();
            if (socketChannel!=null)
            {
                new hanlder(selector,socketChannel);
            }
        }
    }
}
