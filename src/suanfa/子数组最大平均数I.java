package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/2/4 9:26
 * @updateDate 2021/2/4 9:26
 **/
public class 子数组最大平均数I {
    public static double findMaxAverage(int[] nums, int k) {
        int left=1;
        int right=k;
        int num=0;
        for (int i=0;i<k;i++)
        {
            num+=nums[i];
        }
        int temp=num;
        while (right<nums.length)
        {
            temp=temp-nums[left-1]+nums[right];
            if (temp>num)
            {
                num=temp;
            }
            left++;
            right++;
        }
      double ans = (double)num/k;
        return  ans;
    }
    public static void main(String[] args) {
        int[] nums=new int[]{0,4,0,3,2};
        findMaxAverage(nums,1);
    }
}
