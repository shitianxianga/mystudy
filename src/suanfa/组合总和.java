package suanfa;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/2/20 10:46
 * @updateDate 2021/2/20 10:46
 **/
public class 组合总和 {
    public List<List<Integer>> lists=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(candidates,target,0,new ArrayList<>());
        return lists;
    }
    public void dfs(int [] nums,int target,int index,List<Integer> list)
    {
        if (target==0)
        {
            lists.add(new ArrayList<>(list));
        }
        if (target<0)
        {
            return;
        }
        for (int i=index;i<nums.length;i++)
        {
            target-=nums[i];
            dfs(nums,target,i,list);
            target+=nums[i];
        }
    }
}
