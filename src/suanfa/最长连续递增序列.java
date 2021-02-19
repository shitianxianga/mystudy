package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/1/25 9:52
 * @updateDate 2021/1/25 9:52
 **/
public class 最长连续递增序列 {
    public int findLengthOfLCIS(int[] nums) {
        int num=1;
        int ans=1;
        for (int i=1;i<nums.length;i++)
        {
            if (nums[i]>nums[i-1])
            {
                num++;
                continue;
            }
            ans=Math.max(ans,num);
            num=1;

        }

        return ans;
    }
}
