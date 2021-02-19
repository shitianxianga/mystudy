package suanfa;

import com.sun.org.apache.bcel.internal.generic.LUSHR;

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
 * @createDate 2021/1/18 11:04
 * @updateDate 2021/1/18 11:04
 **/
public class 是否为二叉搜索树和完全二叉树 {
    public boolean[] judgeIt (TreeNode root) {
        // write code here
        List<Integer> list=new ArrayList<>();
        boolean[] ans=new boolean[]{true,true};
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        zhong(root,list);
        for (int i=1;i<list.size();i++)
        {
            if (list.get(i)<list.get(i-1))
            {
                ans[0]=false;
            }
        }
        double censhu=0;
        while (!queue.isEmpty())
        {
            int size=queue.size();
            for (int i=queue.size()-1;i<=0;i++)
            {
                TreeNode node=queue.poll();
                if (node.left!=null)
                {
                    queue.add(node.left);
                }
                if (node.right!=null)
                {
                    queue.add(node.right);
                }
            }
            censhu++;
        }
        if (Math.pow(2,censhu)-1!=list.size())
        {
            ans[1]=false;
        }
        return ans;
    }
    public void  zhong(TreeNode root, List<Integer> list)
    {
        if (root==null)
        {
            return;
        }
        zhong(root.left,list);
        list.add(root.val);
        zhong(root.right,list);
    }
}
