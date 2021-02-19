package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/10/10 13:55
 * @updateDate 2020/10/10 13:55
 **/
public class 环形链表 {
    public ListNode detectCycle(ListNode head) {
        if (head==null)
        {
            return null;
        }
        ListNode fast=head;
        ListNode low=head;
        while(fast!=null)
        {
            low=low.next;
            if (fast.next!=null)
            {
                fast=fast.next.next;
            }else
            {
                return null;
            }
            if (fast==low)
            {
                ListNode pre=head;
                while (pre!=low)
                {
                    pre=pre.next;
                    low=low.next;
                }
                return pre;
            }
        }
return null;
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
