package suanfa;

import java.util.List;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/11/30 17:24
 * @updateDate 2020/11/30 17:24
 **/
public class 合并两个链表 {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode r=new ListNode();
        ListNode end=list2;
        ListNode f=list1;
        r=list1;
        while (b>0)
        {
            r=r.next;
            b--;
        }
        while (end.next!=null)
        {
            end=end.next;
        }
        end.next=r;
        while (a>0)
        {
            f=f.next;
        }
        f.next=list2;
        return list1;
    }
}
