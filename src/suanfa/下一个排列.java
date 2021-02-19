package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/11/10 9:24
 * @updateDate 2020/11/10 9:24
 **/
public class 下一个排列 {
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while (i>=0&&nums[i]<nums[i+1])
        {
                i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j > i && nums[j] <= nums[i])
            {
                j--;
            }
            swap(nums,i,j);
        }
        resv(nums,i++);
    }
    public void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void  resv(int[] nums,int start)
    {
        int length=nums.length-1;
        while (start<length)
        {
            swap(nums,start,length);
            start++;
            length--;
        }
    }
}
