package suanfa;

import jdk.internal.org.objectweb.asm.Handle;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/11/27 9:13
 * @updateDate 2020/11/27 9:13
 **/
public class 四数相加 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for (int i=0;i<A.length;i++)
        {
            for (int j=0;j<B.length;j++)
            {
                int temp=A[i]+B[j];
                if (map.containsKey(temp))
                {
                    map.put(temp,map.get(temp)+1);
                    continue;
                }
                map.put(temp,1);
            }
        }
        for (int i=0;i<C.length;i++)
        {
            for (int j=0;j<D.length;j++)
            {
                int temp=C[i]+D[j];
                if (map.containsKey(-temp))
                {
                   ans=map.get(-temp);
                }
            }
        }
        return ans;
    }
}
