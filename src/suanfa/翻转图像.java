package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/2/24 9:10
 * @updateDate 2021/2/24 9:10
 **/
public class 翻转图像 {
    public int[][] flipAndInvertImage(int[][] A) {
        int [][] B=new int[A.length][A[0].length];
        int l=A[0].length-1;
        for (int i=0;i<A.length;i++)
        {
            for (int j=A[0].length-1;j>=0;j--)
            {
                B[i][l-j]=1-A[i][j];
            }
        }
        return B;

    }
}
