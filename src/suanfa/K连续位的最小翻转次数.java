package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/2/19 10:20
 * @updateDate 2021/2/19 10:20
 **/
public class K连续位的最小翻转次数 {

    public int minKBitFlips(int[] A, int K) {
        int l=0;
        int[] diff=new int[A.length+1];
        int rev=0;
        int r=l+K-1;
        int count=0;
        while (r<A.length)
        {
            rev+=diff[l];
            if (A[l]==1||(A[l]+rev)%2!=0)
            {
                l++;
                r++;
            }
            else
            {
                diff[r+1]--;
                count++;
            }
        }
        return count;
    }
}
