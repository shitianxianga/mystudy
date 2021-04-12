package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/9 15:42
 * @updateDate 2021/4/9 15:42
 **/
public class 寻找旋转排序数组中的最小值II {
    public int findMin(int[] nums)
    {
        int left=0;
        int right=nums.length-1;
        while (left<right)
        {
            int mid=(left+right)/2;
            if (nums[mid]==nums[right])
            {
                right=mid;
            }else if (nums[mid]<nums[right])
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return nums[left];
    }
}
