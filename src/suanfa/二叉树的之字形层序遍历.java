package suanfa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/1/15 15:05
 * @updateDate 2021/1/15 15:05
 **/
public class 二叉树的之字形层序遍历 {
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder (TreeNode root) {
        // write code here
        boolean flag=true;
        Queue<TreeNode> queue=new LinkedList<>();
        if (root==null)
        {
            return new ArrayList<>();
        }
        ArrayList<ArrayList<Integer>> lists=new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty())
        {
            ArrayList<Integer>list=new ArrayList<>();
             for (int i=queue.size()-1;i>=0;i--)
            {
                TreeNode node=queue.poll();
                list.add(node.val);
                if(node.left!=null)
                {
                    queue.add(node.left);
                }
                if (node.right!=null)
                {
                    queue.add(node.right);
                }
            }
            ArrayList<Integer> ans=new ArrayList<>();
            if (flag)
            {
                lists.add(list);
            }
            else
            {
                for (int i=list.size()-1;i>=0;i--)
                {
                    ans.add(list.get(i));
                }
                lists.add(ans);
            }
            flag=!flag;


        }
        return lists;
    }
}
