package fxsuanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/24 15:43
 * @updateDate 2021/3/24 15:43
 **/
public class 合并两个有序链表 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node=new ListNode(-1);
        ListNode head=node;
        while (l1!=null||l2!=null)
        {
            if (l1!=null&&l2!=null)
            {
                if (l1.val>l2.val)
                {
                    node.next=l1;
                    l1=l1.next;
                }
                else
                {
                    node.next=l2;
                    l2=l2.next;
                }
            }
            if (l1==null&&l2!=null)
            {
                node.next=l2;
                l2=l2.next;
            }
            if (l2==null&&l1!=null)
            {
                node.next=l1;
                l1=l1.next;
            }
            node=node.next;
        }
        return head.next;
    }
}
