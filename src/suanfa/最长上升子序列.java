package suanfa;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 最长上升子序列 {
    public int lengthOfLIS(int[] nums) {
        int[] dp=new int[nums.length+1];
        Arrays.fill(dp,1);
        int maxs=1;
        for (int i=1;i<nums.length;i++)
        {
            int max=0;
             for (int j=0;j<i;j++)
             {
                 if (nums[i]>nums[j])
                 {
                     max=Math.max(dp[j]+1,max);
                 }
             }
             dp[i]=max;
             maxs=Math.max(max,maxs);
        }
        return maxs;
    }
}
