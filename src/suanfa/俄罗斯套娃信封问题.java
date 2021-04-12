package suanfa;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/4 9:18
 * @updateDate 2021/3/4 9:18
 **/
public class 俄罗斯套娃信封问题 {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]==o2[0]?o1[1]-o2[1]:o1[0]-o2[0];
            }
        });

        int[] dp=new int[envelopes.length];
        dp[0]=1;
        for (int i=1;i<envelopes.length;i++)
        {
            if (envelopes[i][0]>envelopes[i-1][0]&&envelopes[i][1]>envelopes[i-1][1])
            {
                dp[i]=dp[i-1]+1;
            }
            else
            {
                for (int j=i;j>=0;j--)
                {
                    if (envelopes[i][0]>envelopes[j][0]&&envelopes[i][1]>envelopes[j][1])
                    {
                        dp[i]=dp[i-1]+1;
                        break;
                    }
                }
            }
        }
        return Arrays.stream(dp).max().getAsInt();

    }
}
