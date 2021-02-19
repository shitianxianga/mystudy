package suanfa;

import java.util.ArrayList;
import java.util.List;

public class 子集 {
    List<List<Integer>> lists=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {

        hs(nums,0,new ArrayList());
        return lists;
    }
    public  void  hs(int[] nums,int pos,List list)
    {
        if (pos==nums.length)
        {
             lists.add(new ArrayList<>(list));
        }
        for (int i=pos;i<nums.length;i++)
        {
            list.add(nums[i]);
            hs(nums,pos+1,list);
            list.remove(list.size()-1);
        }
    }
}
