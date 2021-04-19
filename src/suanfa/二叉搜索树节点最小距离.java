package suanfa;

import utils.Mapper;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/13 14:32
 * @updateDate 2021/4/13 14:32
 **/
public class 二叉搜索树节点最小距离 {
    int min=Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        if (root.right!=null)
        {
            min=Math.min(min,Math.abs(root.val-root.right.val));
            minDiffInBST(root.right);
        }
        if (root.left!=null)
        {
            min=Math.min(min,Math.abs(root.val-root.left.val));
            minDiffInBST(root.left);
        }
        return min;
    }
}
