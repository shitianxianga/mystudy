package Nio;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/13 9:40
 * @updateDate 2021/4/13 9:40
 **/
public class FormatInfo  implements Runnable{
    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(100);
                String s = Register.recv.take();
                s=s.trim();
                Register.sends.put(s);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
