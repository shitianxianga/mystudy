package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/9/23 15:29
 * @updateDate 2020/9/23 15:29
 **/
public class 合并二叉树 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode treeNode=new TreeNode(1);
        merge(treeNode,t1,t2);
        return  treeNode;
    }
    public void merge(TreeNode root,TreeNode t1,TreeNode t2)
    {
        int a=0;
        int b=0;
        if (t1!=null)
        {
            a=t1.val;
        }
        if (t2!=null)
        {
            b=t2.val;
        }
        root.val=a+b;
        if (t1==null&&t2!=null)
        {
            if (t2.left!=null)
            {
                TreeNode left=new TreeNode(1);
                root.left=left;
                merge(root.left,t1.left,t2.left);
            }
            if (t2.right!=null)
            {
                TreeNode right=new TreeNode(1);
                root.right=right;
                merge(root.right,t1.right,t2.right);
            }
        }
        if (t2==null&&t1!=null)
        {
            if (t1.left!=null)
            {
                TreeNode left=new TreeNode(1);
                root.left=left;
                merge(root.left,t1.left,t2.left);
            }
            if (t1.right!=null)
            {
                TreeNode right=new TreeNode(1);
                root.right=right;
                merge(root.right,t1.right,t2.right);
            }
        }
        if (t2!=null&&t1!=null)
        {
                TreeNode left=new TreeNode(1);
                root.left=left;
                merge(root.left,t1.left,t2.left);

                TreeNode right=new TreeNode(1);
                root.right=right;
                merge(root.right,t1.right,t2.right);

        }




    }
}
