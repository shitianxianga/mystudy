package fxsuanfa;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/26 10:33
 * @updateDate 2021/3/26 10:33
 **/
public class 组合总和 {
    List<Integer> list=new ArrayList<>();
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(candidates,target,0);
        return ans;
    }
    public void dfs(int [] nums,int target,int sum)
    {
        if (sum>target)
        {
            return;
        }
        if (sum==target)
        {
            ans.add(new ArrayList<>(list));
        }
        for (int i=0;i<nums.length;i++)
        {
            list.add(nums[i]);
            dfs(nums,target,sum);
            list.remove(list.size()-1);
        }
    }
}
