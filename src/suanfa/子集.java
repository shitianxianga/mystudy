package suanfa;

import java.util.ArrayList;
import java.util.List;

public class 子集 {
    List<List<Integer>> lists=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        dfs(nums, new ArrayList<Integer>(), 0);
        return lists;
    }
    public void  dfs(int[] nums,List<Integer> list,int i)
    {
        lists.add(new ArrayList<>(list));
        for (;i<nums.length;i++)
        {
            list.add(nums[i]);
            dfs(nums,list,i+1);
            list.remove(list.size()-1);
        }
    }

}
