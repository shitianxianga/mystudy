package suanfa;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/12/18 9:29
 * @updateDate 2020/12/18 9:29
 **/
public class 找不同 {
    public char findTheDifference(String s, String t) {
        Lock lock=new ReentrantLock();
        for (int i=0;i<t.length();i++)
        {
            if (s.contains(""+t.charAt(i)))
            {
                s=s.replaceFirst(""+t.charAt(i),"");
                continue;
            }
            return t.charAt(i);
        }
        return ' ';
    }
}
