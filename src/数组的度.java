import jdk.internal.org.objectweb.asm.Handle;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/2/20 9:19
 * @updateDate 2021/2/20 9:19
 **/
public class 数组的度 {
    public int findShortestSubArray(int[] nums) {

        Map<Integer,Integer> map=new HashMap<>();
        int num=0;
        int k=1;
        for (int i=0;i<nums.length;i++) {
            if (map.containsKey(nums[i]))
            {
                int temp=map.get(nums[i]);
                temp+=1;
                if(temp>k)
                {
                    k=temp;
                    num=nums[i];
                }
                continue;
            }
            map.put(nums[i],1);
        }
        int index=0;
        for (int i=0;i<nums.length;i++)
        {
            if (num==nums[i])
            {
                index=i;
                break;
            }
        }
        for (int i=index;i<nums.length;i++)
        {
            if (nums[i]==num)
            {
                k--;
                if (k==0)
                {
                    return i-index+1;
                }
            }
        }
        return 1;

    }
}
