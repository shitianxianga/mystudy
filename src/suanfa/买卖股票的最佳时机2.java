package suanfa;

import java.util.Arrays;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/11/9 9:40
 * @updateDate 2020/11/9 9:40
 **/
public class 买卖股票的最佳时机2 {
    public int maxProfit(int[] prices) {

        int[] dp=new int[prices.length];
        int sum=0;
        Arrays.fill(dp,0);
        for (int i=1;i<prices.length;i++)
        {
            if (prices[i]-prices[i-1]>0)
            {
                dp[i]=dp[i-1]+(prices[i]-prices[i-1]);
            }
            else
            {
                sum+=dp[i-1];
            }
        }
        return sum+dp[prices.length-1];
    }
}
