package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/2/7 9:40
 * @updateDate 2021/2/7 9:40
 **/
public class 非递减数列 {
    public boolean checkPossibility(int[] nums) {
        int count=0;
        int min=nums[0];
        for (int i=1;i<nums.length;i++)
        {
            if (nums[i]<min)
            {
                count++;
                min=nums[i];
                if (count>1)
                {
                    return  false;
                }
            }
        }
        return true;
    }
}
