package suanfa;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/27 10:02
 * @updateDate 2021/3/27 10:02
 **/
public class 旋转链表  {
    public ListNode rotateRight(ListNode head, int k) {
        Deque<ListNode> deque=new LinkedList<>();
        ListNode pre=new ListNode(-1);
        pre.next=head;
        ListNode end=null;
        ListNode h=null;
        while (head!=null)
        {
            deque.push(head);
            head=head.next;
        }
        int index=k%deque.size();
        end=deque.poll();
        while (index>=0)
        {
            h=deque.poll();
        }
        end.next=pre.next;
        pre.next=h.next;
        h.next=null;
        return pre.next;
    }
}
