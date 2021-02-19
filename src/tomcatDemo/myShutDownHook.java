package tomcatDemo;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/11/19 14:55
 * @updateDate 2020/11/19 14:55
 **/
public class myShutDownHook extends Thread {
    @Override
    public void run() {
        System.out.println("bye");
    }
}
