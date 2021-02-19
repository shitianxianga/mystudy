package suanfa;

import java.util.Arrays;

/**
 * 思路是利用相同数字进行或运算时会变成0，最后或运算完就剩单一的那个数字了
 */
public class leetcode01 {
  static     int findOne(int[] a)
    {
        if (a.length==1)
        {
            return a[0];
        }
        int s=a[0];
        for (int i=1;i<a.length;i++)
        {
            s=s^a[i];
        }
        return s;
    }
    public static void main(String[] args) {
        int[] a={1,1,2,2,3};
        System.out.println(findOne(a));

    }
}
