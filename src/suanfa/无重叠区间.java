package suanfa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/12/31 9:29
 * @updateDate 2020/12/31 9:29
 **/
public class 无重叠区间 {
    public int eraseOverlapIntervals(int[][] intervals) {


        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
               return  o1[1]-o2[1];

            }
        });
        int[] flag=new int[intervals.length];
        int count=0;
        int j=1;
        for (int i=0;i<intervals.length-1;i++)
        {
            if (flag[i]==1)
            {
                continue;
            }
            if (intervals[i][0]>intervals[j][0])
            {
                flag[j]=1;
                count++;
                j++;
                continue;
            }
            else {
                i++;
                j++;
            }
        }
        return count;

    }
}
