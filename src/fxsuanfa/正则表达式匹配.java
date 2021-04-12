package fxsuanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/24 10:13
 * @updateDate 2021/3/24 10:13
 **/
public class 正则表达式匹配 {
    public boolean isMatch(String s, String p) {
        if (p.equals(s))
        {
            return true;
        }
        int n=s.length();
        int m=p.length();
        boolean[][] dp=new boolean[n+1][m+1];
        dp[0][0]=true;
        for (int i=2;i<=m;i+=2)
        {
            if (p.charAt(i-1)=='*')
            {
                dp[0][i]=dp[0][i-2];
            }
        }
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=m;j++)
            {
                if (p.charAt(j)=='*') {
                    dp[i][j]=dp[i][j-2];
                    if (p.charAt(j-2)==s.charAt(i-1))
                    {
                        dp[i][j]=dp[i][j]||dp[i-1][j];
                    }
                }
                else
                {
                    if ((s.charAt(i-1)==p.charAt(j-1))||p.charAt(j-1)=='.')
                    {
                        dp[i][j]=dp[i-1][j-1];
                    }
                }
            }
        }
        return dp[n][m];

    }
}
