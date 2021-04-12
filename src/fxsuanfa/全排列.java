package fxsuanfa;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/26 14:55
 * @updateDate 2021/3/26 14:55
 **/
public class 全排列 {
    List<List<Integer>> lists=new ArrayList<>();
    List<Integer> list=new ArrayList<>();
     boolean[]dp;
    public List<List<Integer>> permute(int[] nums) {

        dp=new boolean[nums.length];
        dfs(nums,0);
        return lists;
    }
    public void dfs(int[] nums,int index)
    {
        if (list.size()==nums.length)
        {
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int i=0;i<nums.length;i++)
        {
           if (!dp[i]) {
               dp[i]=true;
               list.add(nums[i]);
               dfs(nums, i);
               list.remove(list.size() - 1);
               dp[i]=false;
           }

        }
    }
}
