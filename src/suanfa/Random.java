package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/10/12 10:47
 * @updateDate 2020/10/12 10:47
 **/
public class Random {
    private static Integer send=2;
    public  static  int getRandom()
    {
        send=(25214903*send)&((1<<48)-1);
        return send;
    }
}
