package suanfa;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/1/18 10:03
 * @updateDate 2021/1/18 10:03
 **/
public class 前序中序后序 {
    public int[][] threeOrders (TreeNode root) {
        // write code here
        List<Integer> list1=new ArrayList<>();
        qianxu(root,list1);
        List<Integer> list2=new ArrayList<>();
        zhong(root,list2);
        List<Integer> list3=new ArrayList<>();
        hou(root,list3);

        int[][] ans=new int[3][list1.size()];
        for (int i=0;i<list1.size();i++)
        {
            ans[0][i]=list1.get(i);
        }
        for (int i=0;i<list1.size();i++)
        {
            ans[1][i]=list2.get(i);
        }
        for (int i=0;i<list1.size();i++)
        {
            ans[1][i]=list3.get(i);
        }
        return ans;


    }
    public void  qianxu(TreeNode root, List<Integer> list)
    {
        list.add(root.val);
        qianxu(root.left,list);
        qianxu(root.right,list);
    }
    public void  zhong(TreeNode root, List<Integer> list)
    {
        zhong(root.left,list);
        list.add(root.val);
        zhong(root.right,list);
    }
    public void  hou(TreeNode root, List<Integer> list)
    {

        zhong(root.left,list);
        zhong(root.right,list);
        list.add(root.val);

    }
}
