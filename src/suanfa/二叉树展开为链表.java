package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/21 15:03
 * @updateDate 2021/4/21 15:03
 **/
public class 二叉树展开为链表 {
    public void flatten(TreeNode root) {
        TreeNode head=new TreeNode(-1);
        TreeNode node=head;
        dfs(root,node);
        root=head.right;
    }
    public void  dfs(TreeNode root,TreeNode node)
    {
        if (root.left!=null)
        {
            dfs(root.left,node);
        }
        node.right=new TreeNode(root.val);
        node=node.right;
        if (root.right!=null)
        {
            dfs(root.right,node);
        }
    }
}
