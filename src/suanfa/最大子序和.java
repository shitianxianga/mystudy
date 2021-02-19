package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/11/3 10:33
 * @updateDate 2020/11/3 10:33
 **/
public class 最大子序和 {
    public int maxSubArray(int[] nums) {
        int pre=0; int sum=nums[0];
        for (int i=0;i<nums[i];i++)
        {
            pre=Math.max(pre+nums[i],nums[i]);
            sum=Math.max(sum,pre);
        }
        return sum;
    }
}
