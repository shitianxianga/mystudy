package suanfa;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/1 9:31
 * @updateDate 2021/3/1 9:31
 **/
public class 数组不可变 {

    class NumArray {
        int [] sums;
        public NumArray(int[] nums) {
            sums=new int[nums.length+1];
            for (int i=0;i<nums.length;i++)
            {
                sums[i+1]=sums[i]+nums[i];
            }
        }

        public int sumRange(int i, int j) {
          return sums[j+1]-sums[i];
        }

    }
}
