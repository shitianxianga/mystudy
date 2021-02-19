package suanfa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/1/12 16:29
 * @updateDate 2021/1/12 16:29
 **/
public class 公平的糖果交换 {
    public int[] fairCandySwap(int[] A, int[] B) {

        int sumA=Arrays.stream(A).sum();
        int sumB=Arrays.stream(B).sum();
        int num= (sumA+sumB)/2;
        if (sumA<num)
        {
            int c=num-sumA;
            for (int i=0;i<A.length;i++)
            {
                int temp=A[i]+c;
               for (int j=0;j<B.length;j++) {
                   if (B[j]==temp) {
                       return new int[]{A[i], temp};
                   }
               }

            }
        }
        else
        {
            int c=num-sumB;
            for (int i=0;i<B.length;i++)
            {
                int temp=B[i]+c;
                for (int j=0;j<A.length;j++) {
                    if (A[j]==temp) {
                        return new int[]{B[i], temp};
                    }
                }
            }
        }
        return null;
    }
}
