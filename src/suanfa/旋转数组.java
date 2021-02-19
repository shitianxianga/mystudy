package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/1/8 9:26
 * @updateDate 2021/1/8 9:26
 **/
public class 旋转数组 {
    public void rotate(int[] nums, int k) {

        for(int i=0;i<k;i++)
        {
            int temp=nums[nums.length-1];
            for (int j=nums.length-2;j>=0;j--)
            {
                nums[j+1]=nums[j];
            }
        }
    }
}
