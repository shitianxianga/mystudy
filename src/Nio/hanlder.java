package Nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;

public class hanlder implements  Runnable {
    private Selector selector;
    private SocketChannel socketChannel;
    private String  state;
    private ByteBuffer byteBuffer;
    public hanlder(Selector selector, SocketChannel socketChannel) throws IOException {
        this.selector=selector;
        this.socketChannel=socketChannel;
        socketChannel.configureBlocking(false);
        SelectionKey key=socketChannel.register(selector,0);
        key.attach(this);
        byteBuffer=ByteBuffer.allocate(1024);
        this.state="reading";
    }

    @Override
    public void run() {
        if (state.equals("reading"))
        {
            try {
                read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(state.equals("sending"))
        {
            send();
        }
    }

    private void send() {
    }

    private void read() throws IOException {
        byteBuffer.flip();
        socketChannel.read(byteBuffer);
    }
}
