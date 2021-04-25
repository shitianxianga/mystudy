package suanfa;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/25 10:02
 * @updateDate 2021/4/25 10:02
 **/
public class 递增顺序搜索树 {
    List<TreeNode> list=new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        inner(root);
        for (int i=0;i<list.size();i++)
        {
            list.get(i).left=null;
            list.get(i).right=null;
        }
        for (int i=0;i<list.size()-1;i++)
        {
            list.get(i).left=null;
            list.get(i).right=list.get(i+1);
        }
        return list.get(0);
    }
    public void  inner(TreeNode root)
    {
        if (root!=null)
        {
            inner(root.left);
            list.add(root);
            inner(root.right);
        }
    }
}
