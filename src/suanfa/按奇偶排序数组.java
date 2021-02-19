package suanfa;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/11/12 9:31
 * @updateDate 2020/11/12 9:31
 **/
public class 按奇偶排序数组 {
    public int[] sortArrayByParityII(int[] A) {
        List<Integer> list=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        int[] B=new int[A.length];
        int k=0;int l=0;
        for (int i=0;i<A.length;i++)
        {
            if (A[i]%2==0)
            {
                list.add(A[i]);
            }
            else
            {
                list1.add(A[i]);
            }
        }
        for (int i=0;i<A.length;i++)
        {
            if (i%2==0)
            {
                B[i]=list.get(k++);
            }
            else
            {
                B[i]=list1.get(l++);
            }
        }
        return B;

    }
}
