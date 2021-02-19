package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/12/1 14:26
 * @updateDate 2020/12/1 14:26
 **/
public class 在排序数组中查找元素的第一个和最后一个位置 {
    public int[] searchRange(int[] nums, int target) {

        int[]ans=new int[2];
        int left =0;
        int right=nums.length-1;
        while (left<=right)
        {
            int mid=(left+right)/2;
            if (nums[mid]==target)
            {
                if (nums[mid-1]!=target)
                {
                    ans[0]=mid;
                    break;
                }
                right=mid-1;

            }
            if (nums[mid]>target)
            {
                right=mid-1;
            }
            if (nums[mid]<target)
            {
                left=mid+1;
            }
        }
        while (left<=right)
        {
            int mid=(left+right)/2;
            if (nums[mid]==target)
            {
                if (nums[mid+1]!=target)
                {
                    ans[1]=mid;
                    break;
                }
                left=mid+1;

            }
            if (nums[mid]>target)
            {
                right=mid-1;
            }
            if (nums[mid]<target)
            {
                left=mid+1;
            }
        }
        return ans;
    }
}
