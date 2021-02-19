package suanfa;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/12/1 16:38
 * @updateDate 2020/12/1 16:38
 **/
public class 范围求和 {
    public int maxCount(int m, int n, int[][] ops) {
        Arrays.sort(ops, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        int x=ops[0][0];
        Arrays.sort(ops, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        int ans=x*ops[0][1];
        return ans;
    }
}
