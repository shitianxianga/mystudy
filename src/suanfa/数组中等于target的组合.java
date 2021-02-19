package suanfa;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/1/18 13:51
 * @updateDate 2021/1/18 13:51
 **/
public class 数组中等于target的组合 {
    static List<List<Integer>> lists=new ArrayList<>();
    public  static  List<List<Integer>> zuhe1(int [] nums,int target)
    {

        dfs(nums,target,new Stack<>(),0);
        return lists;
    }
    public static void dfs(int [] nums, int target, Stack<Integer> stack,int k)
    {
        if (target==0)
        {
            lists.add(new ArrayList<>(stack));
            return;
        }
        if (target<0)
        {
            return;
        }
        for (int i=k;i<nums.length;i++)
        {
            stack.push(nums[i]);
            dfs(nums,target-nums[i],stack,i+1);
            stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,4,5};
        zuhe1(nums,5);
    }
}
