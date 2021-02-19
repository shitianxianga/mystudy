package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/12/21 14:12
 * @updateDate 2020/12/21 14:12
 **/
public class 使用最小花费爬楼梯 {
    public int minCostClimbingStairs(int[] cost) {
        int ans=0;
        for(int i=0;i<cost.length-1;i++)
        {
            if (cost[i]<=cost[i+1])
            {
                ans+=cost[i];
            }
        }
        return 0;
    }
}
