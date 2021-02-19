package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/11/13 9:30
 * @updateDate 2020/11/13 9:30
 **/
class ListNode {
      int val;
    ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class 奇偶链表 {
    public ListNode oddEvenList(ListNode head)
    {
        if(head==null)
        {
            return null;
        }
        ListNode ous=head;
        ListNode qs=head.next;
        ListNode qsMove=qs;
        while (qsMove!=null&&qsMove.next!=null)
        {
            ous.next=qsMove.next;
            ous=ous.next;
            qsMove.next=ous.next;
            qsMove=qsMove.next;

        }
        ous.next=qs;
        return head;
    }
}
