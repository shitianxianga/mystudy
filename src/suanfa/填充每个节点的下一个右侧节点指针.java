package suanfa;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/10/15 9:16
 * @updateDate 2020/10/15 9:16
 **/
public  class 填充每个节点的下一个右侧节点指针 {
    public static Node connect(Node root) {
        if(root==null)
        {
            return root;
        }
        Queue<Node> queue=new LinkedBlockingQueue();
        Node temp=new Node();
        double n=1;
        double x=1;
        queue.offer(root);
        while (!queue.isEmpty())
        {
            temp=queue.poll();
            if (temp.left!=null)
            {
                queue.offer(temp.left);
                queue.offer(temp.right);
                n=n+2;
            }
            if (Math.pow(2,x)-1==n)
            {
                temp.next=null;
            }
            else
            {
                temp.next=queue.element();
            }
        x++;
        }
  return temp;
    }

    public static void main(String[] args) {

    }

}
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
