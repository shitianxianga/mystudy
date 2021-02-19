package suanfa;
/*
题目：
一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。

        机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。

        问总共有多少条不同的路径？
思路：
dfs：因为有两个方向，所以递归首先判断是不是越界，是不是到达目标，然后再往两个方向继续dfs。但是这个方法超时
动态规划：因为有两个方向，所以每个方格的路径数为他的左边和上面方格路径数的和。方程则为：f（i，j）=f（i-1,j)+f(i,j-1)+1

*/

public class 不同路径 {
    public int uniquePaths(int m, int n) {
        int[][]dp=new int[m][n];
        dp[0][0]=1;
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                if (i==0&&j==0)
                {
                    continue;
                }
                if (i==0)
                {
                    dp[i][j]=dp[i][j-1];
                    continue;
                }
                if (j==0)
                {
                    dp[i][j]=dp[i-1][j];
                    continue;
                }
                dp[i][j]=dp[i][j-1]+dp[i-1][j];

            }
        }
        return dp[m-1][n-1];
    }

}
