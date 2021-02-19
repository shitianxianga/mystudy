package suanfa;

import java.util.*;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/11/16 14:38
 * @updateDate 2020/11/16 14:38
 **/
public class 数组的相对排序 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<arr2.length;i++)
        {
            map.put(arr2[i],i);
        }
        Integer[] ans=new Integer[arr1.length];
        for (int i=0;i<arr1.length;i++)
        {
            ans[i]=arr1[i];
        }
        Arrays.sort(ans, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (map.containsKey(o1)&&map.containsKey(o2))
                {
                    return o2-o1;
                }
                if (map.containsKey(o1)&&!map.containsKey(o2))
                {
                    return 1;
                }
                if (map.containsKey(o2)&&!map.containsKey(o1))
                {
                    return -1;
                }
                return o1-o2;
            }
        });
        for (int i=0;i<arr1.length;i++)
        {
            arr1[i]=ans[i];
        }
        return arr1;
    }
}
