package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/25 10:13
 * @updateDate 2021/3/25 10:13
 **/
public class 删除排序链表中的重复元素II {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null||head.next==null)
        {
            return head;
        }
        ListNode pre=new ListNode(-1);
        ListNode ans=pre;
        pre.next=head;
        while (head.next!=null)
        {
            if (head.val==head.next.val)
            {
                head.next=head.next.next;
            }
            else
            {
                head=head.next;
                pre=pre.next;
                pre.next=head;
            }
        }
        return ans.next;
    }
}
