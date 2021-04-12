package suanfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/31 15:36
 * @updateDate 2021/3/31 15:36
 **/
public class 子集II {
    List<List<Integer>> lists=new ArrayList<>();
    List<Integer> list=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        dfs(nums,0);
        return lists;
    }
    public  void dfs (int[] nums,int index)
    {
        lists.add(new ArrayList<>(list));
        if (index>=nums.length)
        {
            return;
        }
        for (int i=index;i<nums.length;i++)
        {
            if (i>index&&nums[i-1]==nums[i])
            {
                continue;
            }
           list.add(nums[i]);
           dfs(nums,i+1);
           list.remove(list.size()-1);
        }
    }
}
