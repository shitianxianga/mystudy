package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/11/26 10:00
 * @updateDate 2020/11/26 10:00
 **/
public class 编辑距离 {
    public int editDistance(String s1,String s2)
    {
        int[][] dp=new int[s1.length()+1][s2.length()+1];
        for (int i=1;i<=s1.length();i++)
        {
            dp[i][0]=i;
        }
        for (int i=0;i<=s2.length();i++)
        {
            dp[0][i]=i;
        }
        for (int i=1;i<s1.length()+1;i++)
        {
            for (int j=1;j<s2.length()+1;j++)
            {
                int temp=dp[i-1][j-1];
                if (s1.charAt(i-1)!=s2.charAt(j-1))
                {
                    temp+=1;
                }
                dp[i][j]=Math.min(dp[i-1][j]+1,Math.min(dp[i][j-1]+1,temp));
            }
        }
        return dp[s1.length()][s2.length()];
    }
}
