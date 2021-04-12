package fxsuanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/26 10:22
 * @updateDate 2021/3/26 10:22
 **/
public class 在排序数组中查找元素的第一个和最后一个位置 {
    public int[] searchRange(int[] nums, int target) {

        int left=0;
        int right=nums.length-1;
        int start=-1;
        int end=-1;
        while (left<=right)
        {
            int mid=(left+right)/2;
            if (nums[mid]==target)
            {
                int index=mid;
                while (nums[index]==target)
                {
                    index--;
                }
                start=index+1;
                index=mid;
                while (nums[index]==target)
                {
                    index++;
                }
                end=index-1;
            }
            if (nums[mid]<target)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return new int[]{start,end};
    }

}
