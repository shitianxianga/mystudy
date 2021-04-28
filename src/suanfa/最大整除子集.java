package suanfa;

import java.util.*;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/25 16:46
 * @updateDate 2021/4/25 16:46
 **/
public class 最大整除子集 {
    class Solution {
        public List<Integer> largestDivisibleSubset(int[] nums) {

            Map<Integer, List<Integer>> lists=new HashMap<>();
            for (int i=0;i<nums.length;i++)
            {
                List<Integer> set=new ArrayList<>();
                set.add(nums[i]);
                lists.put(nums[i],set);
            }
            List<Integer> list=new ArrayList<>();
            list.add(nums[0]);
            Arrays.sort(nums);
            for (int i=1;i<nums.length;i++){
                List<Integer> list1=new ArrayList<>();
                for (int j=i-1;j>=0;j--)
                {
                    if(nums[i]%nums[j]==0)
                    {
                        if (list1.size()<lists.get(nums[j]).size())
                        {
                            list1=lists.get(nums[j]);
                        }
                    }
                }
                for(Integer num: list1)
                {
                    lists.get(nums[i]).add(num);
                }
                if (lists.get(nums[i]).size()>list.size())
                {
                    list=lists.get(nums[i]);
                }
            }
            return list;
        }
    }
}
