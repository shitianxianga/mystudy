package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/16 9:16
 * @updateDate 2021/3/16 9:16
 **/
public class 螺旋矩阵II {
    public int[][] generateMatrix(int n) {
        int[][] ans=new int[n][n];
        boolean[][] flag=new boolean[n][n];
        int dir=1;
        int num=1;
        int i=0;
        int j=0;
        while (num<=n*n)
        {
            if (dir==1)
            {
                if (j<n&&!flag[i][j])
                {
                    flag[i][j]=true;
                    ans[i][j++]=num++;
                }
                else
                {
                    j--;
                    i++;
                    dir=2;
                }
            }
            if (dir==2)
            {
                if (i<n&&!flag[i][j]) {
                    flag[i][j]=true;
                    ans[i++][j]=num++;
                }
                else
                {
                    i--;
                    j--;
                    dir=3;
                }
                continue;
            }
            if (dir==3)
            {
                if (j>=0&&!flag[i][j]) {
                    flag[i][j]=true;
                    ans[i][j--]=num++;
                }
                else
                {
                    j++;
                    i--;
                    dir=4;
                }
                continue;
            }
            if (dir==4)
            {
                if (i>=0&&!flag[i][j]) {
                    flag[i][j]=true;
                    ans[i--][j]=num++;
                }
                else
                {
                    i++;
                    j++;
                    dir=1;
                }
                continue;
            }
        }
        return ans;
    }
}
