package tomcatDemo;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/11/19 14:57
 * @updateDate 2020/11/19 14:57
 **/
public class myShutDownHookDemo {
    public static void main(String[] args) {
        myShutDownHook hook=new myShutDownHook();
        Runtime.getRuntime().addShutdownHook(hook);
        String a="";
        while (!a.equals("quit"))
        {
            a= new Scanner(System.in).next();
        }
        System.out.println("end");
    }
}
