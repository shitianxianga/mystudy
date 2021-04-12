package fxsuanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/26 15:07
 * @updateDate 2021/3/26 15:07
 **/
public class 旋转图像 {
    public void rotate(int[][] matrix) {
        for (int i=0;i<matrix.length/2;i++)
        {
            for (int j=0;j<matrix[0].length;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j] = matrix[matrix.length-i-1][j];
                matrix[matrix.length-i-1][j]=temp;

            }
        }
        for (int i=0;i<matrix.length;i++)
        {
            for (int j=0;j<matrix[0].length-i;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
}
