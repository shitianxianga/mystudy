package lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/29 14:49
 * @updateDate 2021/3/29 14:49
 **/
public class testInterupter {
    public static void main(String[] args) throws InterruptedException {

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
            while (true)
            {

            }
            }
        });

        thread.start();
        thread.interrupt();
        Lock lock=new ReentrantLock();
         lock.lockInterruptibly();
         lock.lock();
         lock.tryLock();
    }
}
