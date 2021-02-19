package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/11/27 9:32
 * @updateDate 2020/11/27 9:32
 **/
public class 两数之和 {
    public int[] twoSum(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while (left<=right)
        {
            int tenp=nums[left]+nums[right];
            if (tenp==target)
            {
                return new int[]{left,right};
            }
            if (tenp<target)
            {
                left++;
            }
            if (tenp>target)
            {
                right--;
            }
        }
        return new int[2];
    }
}
