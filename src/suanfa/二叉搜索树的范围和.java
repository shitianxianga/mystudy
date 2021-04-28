package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/27 9:29
 * @updateDate 2021/4/27 9:29
 **/
public class 二叉搜索树的范围和 {
    int sum=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        dfs(root,low,high);
        return sum;
    }
    public void dfs(TreeNode node,int low,int hight)
    {
        if (node!=null)
        {
            dfs(node.left,low,hight);
            if (node.val>=low&&node.val<=hight)
            {
                sum+=node.val;
            }
            dfs(node.right,low,hight);
        }
    }
}
