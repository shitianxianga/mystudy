package fxsuanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/25 15:53
 * @updateDate 2021/3/25 15:53
 **/
public class 搜索旋转排序数组 {
    int ans=-1;
    public int search(int[] nums, int target) {
        twoSearch(nums,0,nums.length-1,target);
        return  ans;
    }
    public  void twoSearch(int[] nums,int start,int end ,int target)
    {
        int mid=(end+start)/2;
        if (nums[mid]==target)
        {
            ans=mid;
        }
            if (nums[mid]>target)
            {
                if (nums[end]<target)
                {
                    twoSearch(nums,start,mid-1,target);
                }else
                {
                    twoSearch(nums,mid+1,end,target);
                }
            }
            else
            {
                if (nums[end]<target)
                {
                    twoSearch(nums,start,mid-1,target);
                }else
                {
                    twoSearch(nums,mid+1,end,target);
                }
            }

    }
}
