package fxsuanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/29 11:12
 * @updateDate 2021/3/29 11:12
 **/
public class 颜色分类 {

    public void sortColors(int[] nums) {
        int left=0;
        int right=nums.length-1;
        for (int i=0;i<nums.length;i++)
        {
            if (nums[i]==0&&nums[left]!=0)
            {
                int temp=nums[i];
                nums[i]=nums[left];
                nums[left]=temp;
                left++;
            }
            if(nums[i]==2&& nums[right]!=2)
            {
                int temp=nums[i];
                nums[i]=nums[right];
                nums[right]=temp;
                right--;
            }
        }

    }
}
