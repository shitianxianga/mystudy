package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/19 10:10
 * @updateDate 2021/4/19 10:10
 **/
public class 移除元素 {
    public int removeElement(int[] nums, int val) {
        int left=0;
        int right=nums.length-1;
        while (left<right)
        {
            while (nums[right]==val)
            {
                right--;
            }
            while (nums[left]!=val)
            {
                left++;
            }
            int temp=nums[right];
            nums[right--]=nums[left];
            nums[left++]=temp;
        }
        return right+1;
    }
}
