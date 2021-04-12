package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/2/22 9:11
 * @updateDate 2021/2/22 9:11
 **/
public class 托普利茨矩阵 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=0;i<matrix.length;i++)
        {
            for (int j=0;j<matrix[0].length;j++)
            {
                if (i+1<matrix.length&&j+1<matrix[0].length&&matrix[i+1][j+1]!=matrix[i][j])
                {
                    return false;
                }
            }
        }
        return true;
    }
}
