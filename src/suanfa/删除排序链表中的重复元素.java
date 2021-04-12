package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/26 9:24
 * @updateDate 2021/3/26 9:24
 **/
public class 删除排序链表中的重复元素 {
    public ListNode deleteDuplicates(ListNode head) {

        if(head==null)
        {
            return  head;
        }
        ListNode pre = new ListNode(-1);
        pre.next=head;
        while (head.next!=null)
        {
            if (head.next.next!=null&&head.next.val==head.next.next.val)
            {
                head.next=head.next.next;
            }
            head=head.next;
        }
        return pre.next;
    }
}
