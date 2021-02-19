package suanfa;

import java.util.HashSet;
import java.util.Set;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/12/13 9:06
 * @updateDate 2020/12/13 9:06
 **/
public class 存在重复元素 {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length<=1)
        {
            return false;
        }
        Set<Integer> set=new HashSet<>();
        for (int i=0;i<nums.length;i++)
        {
            if (set.contains(nums[i]))
            {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
