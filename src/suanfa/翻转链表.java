package suanfa;

import sun.rmi.log.LogInputStream;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/1/14 14:50
 * @updateDate 2021/1/14 14:50
 **/
public class 翻转链表 {
    public ListNode ReverseList(ListNode head) {
        if (head==null||head.next==null)
        {
            return head;
        }

        ListNode node=ReverseList(head.next);
        head.next.next=head;
        head.next=null;
        return node;

    }
}
