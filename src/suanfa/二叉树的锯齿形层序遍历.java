package suanfa;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Condition;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/12/22 9:17
 * @updateDate 2020/12/22 9:17
 **/
public class 二叉树的锯齿形层序遍历 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lists=new ArrayList<>();
       Map map=new ConcurrentHashMap();
       map.size();
        boolean f=false;
        if(root==null)
        {
            return new ArrayList<>();
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty())
        {
            List<Integer> list=new ArrayList<>();
            List<TreeNode> list1=new ArrayList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                list1.add(node);
                list.add(node.val);
            }
            if (f) {
                for (int i=list1.size()-1;i>=0;i--) {
                    if (list1.get(i).left != null) {
                        queue.offer(list1.get(i).left);
                    }
                    if (list1.get(i).right != null) {
                        queue.offer(list1.get(i).right);
                    }
                }
            }
            else
            {
                for (int i=list1.size()-1;i>=0;i--) {
                    if (list1.get(i).right != null) {
                        queue.offer(list1.get(i).right);
                    }
                    if (list1.get(i).left != null) {
                        queue.offer(list1.get(i).left);
                    }

                }
            }
            lists.add(list);
            f=!f;
        }
        return lists;

    }
}
