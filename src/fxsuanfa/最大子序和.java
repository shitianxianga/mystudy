package fxsuanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/26 15:52
 * @updateDate 2021/3/26 15:52
 **/
public class 最大子序和 {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int sum=nums[0];
        for (int i=1;i<nums.length;i++)
        {
            sum+=nums[i];
            if (sum<0)
            {
                sum=nums[i];
            }
            else
            {
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}
