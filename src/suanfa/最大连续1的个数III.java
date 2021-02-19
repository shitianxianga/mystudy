package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/2/19 9:11
 * @updateDate 2021/2/19 9:11
 **/
public class 最大连续1的个数III {
    public int longestOnes(int[] A, int K) {
        int l=0;
        int r=0;
       while (r<A.length)
       {
           if (K==0)
           {
               l++;
               if (A[l]==0)
               {
                   K++;
               }
           }
           if (A[r]==0&&K>0)
           {
               K--;
           }
           r++;
       }
       return r-l;
    }
}
