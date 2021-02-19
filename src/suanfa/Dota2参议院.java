package suanfa;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/12/11 14:27
 * @updateDate 2020/12/11 14:27
 **/
public class Dota2参议院 {
    public String predictPartyVictory(String senate) {
        ReentrantLock lock=new ReentrantLock();
        int R=0;
        int D=0;
        for (int i=0;i<senate.length();i++)
        {
            if (senate.charAt(i)=='R')
            {
                R++;
            }
            else
            {
                D++;
            }
        }
        if (R>D)
        {
            return "Radiant";
        }
        else if (D>R)
        {
            return "Dire";
        }
        else
        {
            if (senate.charAt(0)==R)
            {
                return "Radiant";
            }
            return "Dire";
        }
    }
}
