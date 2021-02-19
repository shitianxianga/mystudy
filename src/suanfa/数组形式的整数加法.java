package suanfa;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/1/22 9:22
 * @updateDate 2021/1/22 9:22
 **/
public class 数组形式的整数加法 {
    public List<Integer> addToArrayForm(int[] A, int K) {
        String num=""+K;
        char[] chars=num.toCharArray();
        int n=A.length;
        int m=chars.length;
        List<Integer>  list=new ArrayList<>();
            int j=n-1;
            for (int i=m-1;i>=0;i--)
            {
                A[j--]+=chars[i]-'0';
            }
            for (int i=n-1;i>0;i--)
            {
                if (A[i]>=10)
                {
                    int temp=A[i]/10;
                    A[i]=A[i]%10;
                    A[i-1]+=temp;
                }
            }

            for (int i=0;i<n;i++)
            {
                if (i==0&&A[i]>=10)
                {
                    list.add(A[i]/10);
                    list.add(A[i]%10);
                    continue;
                }
                list.add(A[i]);
            }
            return list;
        }


    }

