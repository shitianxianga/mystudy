package suanfa;

import java.util.Arrays;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/16 10:14
 * @updateDate 2021/3/16 10:14
 **/
public class 构成特定和需要添加的最少元素 {
    public int minElements(int[] nums, int limit, int goal) {
        long sum= Arrays.stream(nums).sum();

        if (sum==goal)
        {
            return 0;
        }
        long sub=0;
        if (sum>goal) {
            sub=sum-goal;
        }
        else
        {
            sub=goal-sum;
        }
            if (sub<=limit)
            {
                return 1;
            }
            else
            {
                if (sub%limit==0)
                {
                    return (int)sub/limit;
                }
                else
                {
                    return (int)sub/limit+1;
                }
            }


    }
}
