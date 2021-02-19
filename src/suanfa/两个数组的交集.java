package suanfa;

import java.util.*;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/11/2 9:28
 * @updateDate 2020/11/2 9:28
 **/
public class 两个数组的交集 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map =new HashMap<Integer,Integer>();
        for (int i=0;i<nums1.length;i++)
        {
            if (!map.containsKey(nums1[i]))
            {
                map.put(nums1[i],1);
            }
        }
        for (int i=0;i<nums2.length;i++)
        {
            if (map.containsKey(nums2[i]))
            {
                map.put(nums1[i],2);
            }
        }
        List<Integer> list=new ArrayList<Integer>();
        for (Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            if (entry.getValue()>1)
            {
                list.add(entry.getKey());
            }
        }
        int [] res=new int[list.size()];
        for (int i=0;i<list.size();i++)
        {
            res[i]=list.get(i);
        }
        return  res;
    }
}
