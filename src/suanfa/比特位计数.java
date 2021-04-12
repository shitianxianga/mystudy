package suanfa;

import java.math.BigInteger;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/3 9:13
 * @updateDate 2021/3/3 9:13
 **/
public class 比特位计数 {
    public int[] countBits(int num) {
        if (num==0)
        {
            return new int[]{0};
        }
        int[] nums=new int[num+1];

        nums[0]=0;
        nums[1]=1;
        int x=2;
        for (int i=2;i<=num;i++)
        {
            if (i==x)
            {
                nums[i]=1;
                x*=2;
                continue;
            }

        }
        return nums;
    }
}
