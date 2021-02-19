package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/11/23 9:59
 * @updateDate 2020/11/23 9:59
 **/
public class 排序链表 {
    public ListNode sortList(ListNode head) {
        if (head==null||head.next==null)
        {
            return head;
        }
        ListNode pre=new ListNode(0);
        pre.next=head;
        ListNode last=head;
        ListNode cur=head.next;
        while (cur!=null);
        {
            if (cur.val < last.val) {
                ListNode temp = pre;
                while (cur.val > temp.next.val) {
                    temp = temp.next;
                }
                last.next = cur.next;
                cur.next = temp.next;
                temp.next = cur.next;
            }
            else
            {
                last=last.next;
            }
            cur=last.next;
        }


        return pre.next;
    }
}
