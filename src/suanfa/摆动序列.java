package suanfa;

import java.util.Arrays;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/12/14 9:22
 * @updateDate 2020/12/14 9:22
 **/
public class 摆动序列 {
    public int wiggleMaxLength(int[] nums) {
        int[] dp1=new int[nums.length];
        int[] dp2=new int[nums.length];
        Arrays.fill(dp1,1);
        Arrays.fill(dp2,1);
        for (int i=1;i<nums.length;i++)
        {
            for (int j=0;j<i;j++)
            {
                if (nums[i]>nums[j])
                {
                    dp1[i]=Math.max(dp1[i],dp2[j]+1);
                }
                if (nums[i]<nums[j])
                {
                    dp2[i]=Math.max(dp2[i],dp1[j]+1);
                }
            }
        }
        return Math.max(Arrays.stream(dp1).max().getAsInt(),Arrays.stream(dp2).max().getAsInt());
    }
}
