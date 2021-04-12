package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/30 14:49
 * @updateDate 2021/3/30 14:49
 **/
public class 最大矩形 {
    public int maximalRectangle(char[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] left=new int[m][n];
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                if (j==0)
                {
                    left[i][j] = left[i][j] == 0 ? 0 : 1;
                }
                else {
                    left[i][j] = left[i][j] == 0 ? 0 : left[i][j - 1] + 1;
                }
            }
        }
        for (int i=0;i<n;i++)
        {

        }
        return 0;
    }
}
