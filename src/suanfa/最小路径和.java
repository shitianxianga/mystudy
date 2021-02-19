package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/12/24 9:41
 * @updateDate 2020/12/24 9:41
 **/
public class 最小路径和 {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m][n];
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                if (i==0&&j==0)
                {
                    dp[i][j]=grid[i][j];
                }
                if (i==0&&j!=0)
                {
                    dp[i][j]=dp[i][j-1]+grid[i][j];
                }
                if (j==0&&i!=0)
                {
                    dp[i][j]=dp[i-1][j]+grid[i][j];
                }
                if (j!=0&&i!=0)
                {
                    dp[i][j]=Math.min(dp[i][j-1]+grid[i][j],dp[i-1][j]+grid[i][j]);
                }

            }
        }
        return dp[m][n];

    }
}
