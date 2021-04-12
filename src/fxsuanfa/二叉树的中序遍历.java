package fxsuanfa;

import suanfa.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/31 16:22
 * @updateDate 2021/3/31 16:22
 **/
public class 二叉树的中序遍历 {
    List<Integer> list=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root==null)
        {
            return list;
        }
        dfs(root);
        return list;
    }
    public void  dfs(TreeNode node)
    {
        if (node.left!=null)
        {
            dfs(node.left);
        }
        list.add(node.val);
        if (node.right!=null)
        {
            dfs(node.right);
        }
    }
}
