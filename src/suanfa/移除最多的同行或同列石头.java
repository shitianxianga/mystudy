package suanfa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/1/15 13:45
 * @updateDate 2021/1/15 13:45
 **/
public class 移除最多的同行或同列石头 {
    public int removeStones(int[][] stones) {
        int n=stones.length;
        Map<Integer,Integer> mapX=new HashMap<>();
        Map<Integer,Integer> mapY=new HashMap<>();
        for (int i=0;i<n;i++)
        {
            if (mapX.containsKey(stones[i][0]))
            {
                mapX.put(stones[i][0],mapX.get(stones[i][0])+1);
            }
            else
            {
                mapX.put(stones[i][0],1);
            }
            if (mapY.containsKey(stones[i][1]))
            {
                mapY.put(stones[i][1],mapY.get(stones[i][1])+1);
            }
            else
            {
                mapY.put(stones[i][1],1);
            }
        }
        int  count=0;
        for (int i=0;i<n;i++)
        {

        }
        return 0;
    }
    public void dfs(int[][]stones,int count,int i)
    {

    }
}
