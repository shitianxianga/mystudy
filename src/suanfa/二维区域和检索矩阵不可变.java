package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/2 9:41
 * @updateDate 2021/3/2 9:41
 **/
public class 二维区域和检索矩阵不可变 {
    class NumMatrix {
        int[][]sums;
        public NumMatrix(int[][] matrix) {
            if (matrix.length==0)
            {
                sums=new int[0][0];
            }
            else {
                sums = new int[matrix.length][matrix[0].length + 1];
            }
            for (int i=0;i<matrix.length;i++)
            {
                for (int j=0;j<matrix[0].length;j++)
                {
                    sums[i][j+1]=matrix[i][j]+sums[i][j];
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            int sum=0;
            if (row1>=sums.length||col1>=sums[0].length)
            {
                return 0;
            }
            for (int i=row1;i<=row2;i++)
            {
                sum+=sums[i][col2+1]-sums[i][col1];
            }
            return sum;
        }
    }
}
