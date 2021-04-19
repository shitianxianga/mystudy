package Nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/13 9:17
 * @updateDate 2021/4/13 9:17
 **/
public class MyHandler implements  Runnable{
    private SocketChannel client;
    private SelectionKey sk;
    private ExecutorService service= Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    public MyHandler(SocketChannel client, SelectionKey sk) {
        this.client=client;
        this.sk=sk;
    }

    @Override
    public void run() {
        if (sk.isReadable())
        {
            read();
        }
        else
        {
            write();
        }
    }
    private void  read()
    {
        service.execute(()->{
            try {
                readProcess();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        sk.interestOps(sk.interestOps() | SelectionKey.OP_WRITE);
    }
    private void write()
    {
        service.execute(()->{
            try {
                writeProcess();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        sk.interestOps(sk.interestOps() & ~SelectionKey.OP_WRITE);
    }
    private  void readProcess() throws IOException, InterruptedException {
        ByteBuffer byteBuffer=ByteBuffer.allocate(2048);
        if (client.read(byteBuffer)>0) {

            byteBuffer.flip();
            byte[] bytes = new byte[byteBuffer.limit()];
            byteBuffer.get(bytes);
            String s=new String(bytes);
            if (s.length()>0) {
                Register.recv.put(s);
                System.out.println(s);
            }
        }
    }
    private void writeProcess() throws InterruptedException, IOException {
        String send=Register.sends.take();
        client.write(Charset.forName("UTF-8").encode(send));
    }
}
