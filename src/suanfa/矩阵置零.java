package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/21 9:48
 * @updateDate 2021/3/21 9:48
 **/
public class 矩阵置零 {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[] col=new int[m];
        int [] row=new int[n];
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                if (matrix[i][j]==0)
                {
                    col[i]=1;
                    row[j]=1;
                }
            }
        }
        for (int i=0;i<m;i++)
        {
            if (col[i]==1)
            {
                for (int j=0;j<n;j++)
                {
                    matrix[i][j]=0;
                }
            }
        }
        for (int i=0;i<n;i++)
        {
            if (row[i]==1)
            {
                for (int j=0;j<m;j++)
                {
                    matrix[j][i]=0;
                }
            }
        }
    }

}
