package suanfa;

import java.util.Arrays;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/11/30 17:06
 * @updateDate 2020/11/30 17:06
 **/
public class 富有客户的资产总量 {
    public int maximumWealth(int[][] accounts) {

        int max=Integer.MIN_VALUE;
        for (int i=0;i<accounts.length;i++)
        {
           max=Math.max(max,Arrays.stream(accounts[i]).sum()) ;
        }
        return max;
    }
}
