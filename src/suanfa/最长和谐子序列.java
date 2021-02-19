package suanfa;

import java.util.*;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/12/1 16:03
 * @updateDate 2020/12/1 16:03
 **/
public class 最长和谐子序列 {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> map=new HashMap();

       for (int i=0;i<nums.length;i++)
       {
           if (map.containsKey(nums[i]))
           {
               map.put(nums[i],map.get(nums[i])+1);
               continue;
           }
           map.put(nums[i],1);
       }
       int ans=0;
       for (Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if (map.containsKey(entry.getKey()+1));
            {
                ans=Math.max(ans,map.get(entry.getKey())+map.get(entry.getKey()+1));
            }
        }
       return ans;

    }
}
