package suanfa;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/11/23 9:10
 * @updateDate 2020/11/23 9:10
 **/
public class 用最少数量的箭引爆气球 {
    public int findMinArrowShots(int[][] points) {

        int num=points.length;
        for (int i=0;i<points.length-1;i++)
        {
            if (points[i][1]>=points[i+1][0])
            {
                num--;
                if (points[i][1]>=points[i+1][1])
                {
                    points[i+1][1]=points[i][1];
                }
            }
        }
        return num;
    }
}
