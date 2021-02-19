package suanfa;

import java.util.Arrays;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/11/26 9:51
 * @updateDate 2020/11/26 9:51
 **/
public class 基数排序 {
    public void  jsSort(int[] nums)
    {
        int n=nums.length;
        int[] buf=new int[n];
        int maxPre= Arrays.stream(nums).max().getAsInt();
        int pre=1;
        while (maxPre>=pre)
        {
            int[] cnt=new int[10];
            for (int i=0;i<n;i++)
            {
                int digest=(nums[i]/pre)%10;
                cnt[digest]++;
            }
            for (int i=1;i<10;i++)
            {
                cnt[i]=cnt[i]+cnt[i-1];
            }
            for (int i=n-1;i>=0;i++)
            {
                int digest=(nums[i]/pre)%10;
                buf[cnt[digest]-1]=nums[i];
                cnt[digest]--;
            }
            System.arraycopy(buf,0,nums,0,n);
            pre=pre*10;
        }
    }
}
