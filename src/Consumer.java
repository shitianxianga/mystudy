import java.util.concurrent.BlockingQueue;

//消费者
public class Consumer implements Runnable {

    private final BlockingQueue blockingQueue;

    public Consumer(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {

        //只要阻塞队列中有任务，就一直去消费
        while (true) {

            try {
                System.out.println(Thread.currentThread().getName()+"正在消费： " + blockingQueue.take());
                //让其停止一会，便于查看效果
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
