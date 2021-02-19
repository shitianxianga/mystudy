package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/1/14 10:01
 * @updateDate 2021/1/14 10:01
 **/
public class 重建二叉树 {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode treeNode=buildTree(0,pre.length,in,0,pre);
        return treeNode;

    }
    public TreeNode buildTree(int i,int j,int[] in,int index,int[] pre)

    {
        if(i>j||index>=pre.length)
        {
            return null;
        }
        int num=pre[index];
        TreeNode treeNode=new TreeNode(num);
        int a=i;
        for (;a<j;a++)
        {
            if (num!=in[a])
            {
                continue;
            }
            break;
        }
        treeNode.left=buildTree(i,a-1,in,index+1,pre);
        treeNode.right=buildTree(a+1,j,in,index+a-i+1,pre);
        return treeNode;
    }
}
