package suanfa;

import com.sun.org.apache.bcel.internal.generic.FieldOrMethod;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/2/23 9:19
 * @updateDate 2021/2/23 9:19
 **/
public class 爱生气的书店老板 {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {

        int max=0;
        int ans=0;

        for (int i=0;i<grumpy.length;i++)
        {
            if (grumpy[i]==0)
            {
                ans+=customers[i];
            }
            if (grumpy[i]==1)
            {
                int temp=0;
                if (i+X<grumpy.length) {
                    for (int j = i; j < i + X; j++) {
                        if (grumpy[j] == 1) {
                            temp += customers[j];
                        }
                    }
                }else
                {
                    for (int j = grumpy.length-X; j < grumpy.length; j++) {
                        if (grumpy[j] == 1) {
                            temp += customers[j];
                        }
                    }
                }
                max=Math.max(max,temp);
            }
        }
        if (X>=grumpy.length)
        {
            return ans;
        }
        ans+=max;
        return ans;

    }
}
