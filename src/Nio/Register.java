package Nio;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/13 9:33
 * @updateDate 2021/4/13 9:33
 **/
public class Register {
    public static BlockingQueue<String> recv=new LinkedBlockingQueue<>();
    public static BlockingQueue<String> sends=new LinkedBlockingQueue<>();
}
