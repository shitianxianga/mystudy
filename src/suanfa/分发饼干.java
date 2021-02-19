package suanfa;

import java.util.Arrays;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/12/25 9:07
 * @updateDate 2020/12/25 9:07
 **/
public class 分发饼干 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
       int i=g.length-1;
       int j=s.length-1;
       int nums=0;
       while (i>=0&&j>=0)
       {
           if (s[j]>=g[i])
           {
               nums++;
           }
           i--;
           j--;
       }
       return nums;
    }
}
