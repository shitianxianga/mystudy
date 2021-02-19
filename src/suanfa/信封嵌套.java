package suanfa;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/11/26 10:21
 * @updateDate 2020/11/26 10:21
 **/
public class 信封嵌套 {
    public int maxEnvelopes(int[][] envelopes) {
        if (envelopes.length==0)
        {
            return 0;
        }
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0]<o2[0])
                {
                    return 1;
                }
                else if (o1[0]>o2[0])
                {
                    return -1;
                }
                  else
                {
                    return o2[1]-o1[1];
                }
            }
        });
        int [] nums=new int[envelopes.length];
        for (int i=0;i<envelopes.length;i++)
        {
            nums[i]=envelopes[i][1];
        }
        int[] dp=new int[nums.length];
        Arrays.fill(dp,1);
        for (int i=0;i<nums.length;i++)
        {
            for (int j=0;j<i;j++)
            {
                if (nums[i]>nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }
        return Arrays.stream(nums).max().getAsInt();
    }

}
