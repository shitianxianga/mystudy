package fxsuanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/24 9:12
 * @updateDate 2021/3/24 9:12
 **/
public class 模式132 {
    public boolean find132pattern(int[] nums) {
        boolean flag=false;
        int min=nums[0];
      for (int i=1;i<nums.length;i++)
      {
            if (nums[i]>nums[i-1])
            {
                min=Math.min(min,nums[i-1]);
               flag=true;
            }
            if (flag&&nums[i]<nums[i-1])
            {
                if (nums[i]>min)
                {
                    return true;
                }
            }
      }
        return false;
    }

}
