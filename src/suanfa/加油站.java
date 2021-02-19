package suanfa;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/11/18 9:12
 * @updateDate 2020/11/18 9:12
 **/
public class 加油站 {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        List<Integer> list=new ArrayList<>();
        int gsum=0;
        int csum=0;
        for (int i=0;i<gas.length;i++)
        {
            if (gas[i]>=cost[i])
            {
                list.add(i);
            }
            gsum+=gas[i];
            csum+=cost[i];
        }
        System.out.println(gsum+"　"+csum);
        if (gsum<csum)
        {
            return -1;
        }
        for (int i=0;i<list.size();i++)
        {
            int index=list.get(i);
            int sum=0;
            int j=index;
            while (true)
            {
                sum+=gas[j];
                int tsum=sum;
                if (sum-cost[j]>=0)
                {
                    tsum=sum-cost[j];
                    if (j==gas.length-1)
                    {
                        j=0;
                    }else
                    {
                        j++;
                    }

                }
                if (sum-cost[j]<0)
                {
                    break;
                }
                sum=tsum;
                if (j==index)
                {
                    return index;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] gas=new int[]{1,2,3,4,5};
        int []cost=new int[]{3,4,5,1,2};
        canCompleteCircuit(gas,cost);
    }
}
