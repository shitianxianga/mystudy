package suanfa;
/*
题目：
给定一个二叉树，返回它的中序 遍历。

        示例:

        输入: [1,null,2,3]
        1
        \
        2
        /
        3

        输出: [1,3,2]

思路：
二叉树的中序遍历顺序为左-》中-》右
递归直接解决


*/
import java.util.ArrayList;
import java.util.List;

public class 二叉树的中序遍历 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        inorder(root,list);
        return list;
    }
    public void inorder(TreeNode root,List<Integer> list)
    {
        if (root==null)
        {
            return;
        }
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);

    }
}
