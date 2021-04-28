package suanfa;

import java.util.Arrays;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/25 10:23
 * @updateDate 2021/4/25 10:23
 **/
public class 组合总和Ⅳ {
     static  int count=0;
    public static int combinationSum4(int[] nums, int target) {
        Arrays.sort(nums);
        int end=0;
        if (nums[nums.length-1]<=target)
        {
            end=nums.length-1;
        }
        else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > target) {
                    end = i - 1;
                }
            }
        }
        dfs(nums,end,0,target);
        return count;
    }
    public static void  dfs(int [] nums,int end,int sum,int target)
    {
        if(sum==target)
        {
            count++;
            return;
        }
        if (sum>target)
        {
            return;
        }
        for (int i=0;i<=end;i++)
        {
            dfs(nums,end,sum+nums[i],target);
        }
    }

    public static void main(String[] args) {
        int [] nums=new int[]{1,2,3};
        combinationSum4(nums,35);
    }
}
