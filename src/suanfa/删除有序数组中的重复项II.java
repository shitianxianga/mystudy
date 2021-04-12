package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/6 14:51
 * @updateDate 2021/4/6 14:51
 **/
public class 删除有序数组中的重复项II {
    public int removeDuplicates(int[] nums) {
        int ans=0;
        if (nums.length<3)
        {
            return nums.length;
        }
        for (int i=2;i<nums.length;i++)
        {
            if (nums[i-2]==nums[i])
            {
                for (int j=i+1;j<nums.length;j++)
                {
                    nums[j-1]=nums[j];
                }
                i--;
                ans++;
            }
        }
        return nums.length-ans;
    }
}
