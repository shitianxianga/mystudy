import com.oracle.jrockit.jfr.Producer;

import java.io.File;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;
import java.security.MessageDigest;


public class test {
    public static void main(String[] args) throws InterruptedException, NoSuchAlgorithmException {
     /*   BlockingQueue blockingQueue = new LinkedBlockingQueue(5);

        Product p = new Product(blockingQueue);
        Consumer c1 = new Consumer(blockingQueue);
        Consumer c = new Consumer(blockingQueue);
        ExecutorService service= Executors.newFixedThreadPool(8);
        Thread tp = new Thread(p);
        Thread tc1=new Thread(c1);
        Thread tc= new Thread(c);
        tp.start();
        tc.start();
        tc1.start();*/
        List list=new ArrayList();
      /*  list.add("a");
        list.add("b");
        BlockingQueue blockingQueue=new ArrayBlockingQueue(30,true,list);

        while (!blockingQueue.isEmpty())
        {
            System.out.println(blockingQueue.take());
        }*/
       /* System.out.println(10*(1/8));*/
       /* Map map1=new HashMap();
        Map map2=new HashMap();
        Map map3=new HashMap();
        get();
        get(map1);
        get(map1,map2);
    myMD4.getMD4ofStr("123");
    myMD5 myMD5=new myMD5();*/
        // 加入BouncyCastleProvider支持
        String s1="你好";
        String str2="计算机软件";
        String s2=new StringBuilder("再").append("见").toString();
        System.out.println(s2.intern()==s2);
        String str1 = new StringBuilder("ja").append("va").toString();
        System.out.println(str1.intern() == str1);

    }
   static void get(Map... maps)
    {
        System.out.println(maps.length);
    }

}
