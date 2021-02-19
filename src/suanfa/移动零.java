package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/11/19 9:11
 * @updateDate 2020/11/19 9:11
 **/
public class 移动零 {
    public void moveZeroes(int[] nums) {
        if(nums.length==0||nums.length==1)
        {
            return;
        }
        int i=0;int j=1;
        while (i<j)
        {
            while (nums[i] !=0)
            {
                i++;
            }
            while (nums[j]==0)
            {
                j++;
            }
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }

    }
}
