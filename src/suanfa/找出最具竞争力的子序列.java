package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/11/30 14:40
 * @updateDate 2020/11/30 14:40
 **/
public class 找出最具竞争力的子序列 {
    public int[] mostCompetitive(int[] nums, int k) {
        int  index =0;
        int   p=k-1;
        int index1=0;
        int [] ans=new int[k];
        for (int i=0;i<k;i++)
        {
            int min=Integer.MAX_VALUE;
            for (int j=index;j<nums.length-p;j++)
            {
                if (nums[j]<min)
                {
                    min=nums[j];
                    index=j;
                }
            }
            ans[index1++]=min;
            p--;
        }
        return ans;
    }
}
