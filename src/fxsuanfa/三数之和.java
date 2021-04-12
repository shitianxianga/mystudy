package fxsuanfa;

import java.util.*;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/24 14:24
 * @updateDate 2021/3/24 14:24
 **/
public class 三数之和 {

    public List<List<Integer>> threeSum(int[] nums) {
        Set<Integer> set=new HashSet<>();
        List<List<Integer>> lists=new ArrayList<>();
        for (int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++)
        {
            for (int j=i+1;j<nums.length-1;j++)
            {
                if (nums[j+1]==nums[j])
                {
                    continue;
                }
                if (set.contains(0-(nums[i]+nums[j])))
                {
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(0-(nums[i]+nums[j]));
                    lists.add(list);
                }
            }
        }
        return lists;
    }
}
