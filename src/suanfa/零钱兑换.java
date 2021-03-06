package suanfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 零钱兑换 {
    public int coinChange(int[] coins, int amount) {
        List list=new ArrayList(Arrays.asList(coins));
        int[] dp=new int[amount+1];
        Arrays.fill(dp,amount+1);
        if (list.contains(1))
        {
            dp[0]=0;
        }
        for (int i=1;i<=amount;i++)
        {
           for (int j=0;j<coins.length;j++)
           {
               if (coins[j]<=i) {
                   dp[i] = Math.min(dp[i], dp[i -coins[j]]+1);
               }
           }
        }
        return  dp[amount]>amount?-1:dp[amount];
    }


    }

