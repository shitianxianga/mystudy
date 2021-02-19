package suanfa;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/1/26 9:12
 * @updateDate 2021/1/26 9:12
 **/
public class 等价多米诺骨牌对的数量 {
    public int numEquivDominoPairs(int[][] dominoes) {
        int num=0;
        int n=dominoes.length;
        for (int i=0;i<n;i++)
        {
           if (dominoes[i][0]>dominoes[i][1])
           {
               int temp=dominoes[i][0];
               dominoes[i][0]=dominoes[i][1];
               dominoes[i][1]=temp;
           }
        }
        Arrays.sort(dominoes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        int j=1;
        int temp=0;
        for (int i=1;i<n;i++)
        {
            if (dominoes[i][0]==dominoes[i-1][0]&&dominoes[i][1]==dominoes[i-1][1])
            {
                temp+=j;
                j++;
                continue;
            }
            num+=temp;
            j=1;
            temp=0;


        }
        return num;
    }
}
