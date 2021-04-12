package suanfa;

import java.util.Arrays;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/1 10:01
 * @updateDate 2021/3/1 10:01
 **/
public class 区域和检索数组可修改 {

    class NumArray {
        TreeNode node;
        class TreeNode{
            int start;
            int end;
            int val;
            TreeNode left;
            TreeNode right;

            public TreeNode(int start, int end) {
                this.start = start;
                this.end = end;
                left=null;
                right=null;

            }
        }
        public NumArray(int[] nums) {
            this.node=buildTree(nums,0,nums.length-1);
        }
        private TreeNode buildTree(int[] nums,int start,int end)
        {

            if (start>end)
            {return null;}
            TreeNode node=new TreeNode(start,end);
            if (start==end)
            {
                node.val=nums[start];
            }
            else {
                int mid = start + (end-start) / 2;
                node.left=buildTree(nums,start,mid);
                node.right=buildTree(nums, mid+1, end);
                node.val=node.left.val+node.right.val;
            }
            return node;
        }
        private TreeNode updateTree(TreeNode node,int index,int val)
        {

            if (node.start==node.end)
            {
                node.val=val;
            }
            else {
                int mid = node.start + (node.end-node.start) / 2;
                if (index>mid)
                {
                    updateTree(node.right,index,val);
                }
                else
                {
                    updateTree(node.left,index,val);
                }
                node.val=node.left.val+node.right.val;
            }
            return node;
        }
        private int queryTree(TreeNode node,int left,int right)
        {
            if (node.start==left&&node.end==right)
            {
                return node.val;
            }
            int mid = node.start + (node.end-node.start) / 2;
            if (right<=mid)
            {
               return queryTree(node.left,left,right);
            }
            else if (left>=mid)
            {
              return   queryTree(node.right,left,right);
            }
            else
            {
              return   queryTree(node.left,left,mid)+queryTree(node.right,mid+1,right);
            }
        }

        public void update(int index, int val) {
            updateTree(node,index,val);
        }

        public int sumRange(int left, int right) {
           return queryTree(node,left,right);
        }
    }
}
