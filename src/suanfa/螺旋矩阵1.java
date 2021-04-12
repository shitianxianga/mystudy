package suanfa;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/15 9:18
 * @updateDate 2021/3/15 9:18
 **/
public class 螺旋矩阵1 {
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            boolean [][] flag=new boolean[matrix.length][matrix[0].length];
            int dir=1;
            List<Integer> list=new ArrayList<>();
            int i=0;
            int j=0;
            int n=matrix.length;
            int m=matrix[0].length;
            while (list.size()<matrix.length*matrix[0].length)
            {
                if (dir==1)
                {
                    if (j<m&&!flag[i][j]) {
                        flag[i][j]=true;
                        list.add(matrix[i][j++]);
                    }
                    else
                    {
                        j--;
                        i++;
                        dir=2;
                    }
                    continue;
                }
                if (dir==2)
                {
                    if (i<n&&!flag[i][j]) {
                        flag[i][j]=true;
                        list.add(matrix[i++][j]);
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
                        list.add(matrix[i][j--]);
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
                        list.add(matrix[i--][j]);
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
            return list;
        }
    }
}
