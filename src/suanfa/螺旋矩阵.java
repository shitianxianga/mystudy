package suanfa;

import java.util.ArrayList;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/1/15 16:06
 * @updateDate 2021/1/15 16:06
 **/
public class 螺旋矩阵 {
    public static ArrayList<Integer> spiralOrder(int[][] matrix) {

        int x=matrix.length-1;
        int conX=x;

        int y=matrix[0].length-1;
        int conY=y;
        int i=0;
        int j=0;
        boolean flagX=true;
        boolean flagY=true;
        boolean flag=true;
        ArrayList<Integer> list=new ArrayList<>();
        while (true)
        {
            if (list.size()<matrix.length*matrix[0].length)
            {
                if (flag) {
                    if (flagX) {
                        list.add(matrix[i][j++]);
                        if (j==y)
                        {
                            flag=!flag;
                            flagX=!flagX;
                            y=y-conY;
                            conY--;
                        }
                    } else {
                        list.add(matrix[i][j--]);
                        if (j==y)
                        {
                            flag=!flag;
                            flagX=!flagX;
                            y=y+conY;
                            conY--;
                        }
                    }

                }
                else
                {
                    if (flagY) {
                        list.add(matrix[i++][j]);
                        if (i==x)
                        {
                            flag=!flag;
                            flagY=!flagY;
                            x=x-conX;
                            conX--;
                        }
                    } else {
                        list.add(matrix[i--][j]);
                        if (i==x)
                        {
                            flag=!flag;
                            flagY=!flagY;
                            x=x+conX;
                            conX--;
                        }

                    }

                }
            }
            else {
                break;
            }
        }
        return list;
    }

    public static void main(String[] args) {
      int[][] nums=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(nums));

    }
}
