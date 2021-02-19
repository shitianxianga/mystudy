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
 * @createDate 2020/11/9 9:17
 * @updateDate 2020/11/9 9:17
 **/
public class 最接近原点的K个数啊 {
    public int[][] kClosest(int[][] points, int K) {
        List<int[]> list= Arrays.asList(points);
        list.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o1[0]*o1[0]+o1[1]*o1[1])-(o2[0]*o2[0]+o2[1]*o2[1]);
            }
        });
        int[][] res=new int[K][2];
        for (int i=0;i<K;i++)
        {
            res[i]=list.get(i);
        }
        return res;
    }
}
