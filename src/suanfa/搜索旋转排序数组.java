package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/11/12 16:34
 * @updateDate 2020/11/12 16:34
 **/
public class 搜索旋转排序数组 {
    public int search(int[] nums, int target) {
        int l=0;int r=nums.length-1;
        while (l<=r)
        {
            int mid=(l+r)/2;
            if (nums[mid]==target)
            {
                return mid;
            }
            if (nums[l]<=nums[mid]) {
                if (nums[l] <= target && nums[mid] > target) {
                        r=mid-1;
                }
                else
                {
                    l=mid+1;
                }
            }
            else
            {
                if (nums[mid]<=target&&nums[r]>target)
                {
                    l=mid+1;
                }
                else
                {
                    r=mid-1;
                }
            }
        }
        return -1;
    }
}
