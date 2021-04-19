package suanfa;

import java.util.Arrays;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/15 9:23
 * @updateDate 2021/4/15 9:23
 **/
public class 打家劫舍II {
    public int rob(int[] nums) {
        if (nums.length<3)
        {
            return Arrays.stream(nums).max().getAsInt();
        }
        int[] dp1=new int[nums.length];

        int[] dp2=new int[nums.length];
        dp1[0]=nums[0];
        dp1[1]=Math.max(nums[1],nums[0]);
        dp2[0]=nums[1];
        dp2[1]=Math.max(nums[1],nums[2]);
        for (int i=2;i<nums.length-1;i++)
        {
            dp1[i]=Math.max(dp1[i-1],dp1[i-2]+nums[i]);
        }
        for (int i=3;i<nums.length;i++)
        {
            dp2[i-1]=Math.max(dp2[i-2],dp2[i-3]+nums[i]);
        }
        return Math.max(dp1[nums.length-2],dp2[nums.length-2]);
    }
}
