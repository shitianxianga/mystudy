package fxsuanfa;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/24 15:22
 * @updateDate 2021/3/24 15:22
 **/
public class 删除链表的倒数第N个结点 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Deque<ListNode> deque=new LinkedList<>();
        int i=0;
        ListNode node=head;
        ListNode node1=new ListNode(-1);
        while (node!=null)
        {
            deque.push(node);
            node=node.next;
        }
        while (i<=n)
        {
            node1=deque.poll();
        }
        if (n==1)
        {
            node1.next=null;
        }
        else {
            node1.next = node1.next.next;
        }
        return head;
    }
}
