package suanfa;

import java.util.Arrays;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/11/26 9:09
 * @updateDate 2020/11/26 9:09
 **/
public class 最大间距 {
    public int maximumGap(int[] nums) {

        if (nums.length<2)
        {
            return 0;
        }
        Arrays.sort(nums);
        int res=Integer.MIN_VALUE;
        for (int i=0;i<nums.length-1;i++)
        {
         res=Math.max(res,nums[i+1]-nums[i]);
        }
        return res;
    }
}
