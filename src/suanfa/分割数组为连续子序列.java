package suanfa;

import java.util.Arrays;
import java.util.List;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/12/4 9:08
 * @updateDate 2020/12/4 9:08
 **/
public class 分割数组为连续子序列 {
    public boolean isPossible(int[] nums) {
       if (nums.length<3)
       {
           return false;
       }
       int [] flag=new int[nums.length];
       flag[0]=1;
       int num=1;
       for (int i=1;i<nums.length;i++)
       {
           int temp=nums[i];
           if (temp!=nums[i-1])
           {
               flag[i]=1;
               num++;
           }
           if (nums.length-num==3)
           {
               break;
           }
       }
       return false;
    }

}
