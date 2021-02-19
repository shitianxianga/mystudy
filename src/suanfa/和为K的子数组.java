package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/12/24 15:23
 * @updateDate 2020/12/24 15:23
 **/
public class 和为K的子数组 {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int res=0;
        for (int i=0;i<n;i++)
        {
            int sum=nums[i];
            for (int j=i;j<n;j++)
            {
                if (i==j)
                {
                    if (sum==k)
                    {
                        res++;
                    }
                }else
                {
                    sum+=nums[j];
                    if (sum==k)
                    {
                        res++;
                    }
                }
            }
        }
        return res;
    }
}
