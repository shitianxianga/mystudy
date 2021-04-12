package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/18 10:15
 * @updateDate 2021/3/18 10:15
 **/
public class 反转链表 {
    public ListNode reverseList(ListNode head) {
        ListNode ans=new ListNode(-1);
        ans.next=head;
        ListNode cur=head;
        ListNode next;
        while (cur!=null)
        {
            next=cur.next;
            cur.next=next.next;
            next.next=ans.next;
            ans.next=next;
        }
        return ans.next;
    }
}
