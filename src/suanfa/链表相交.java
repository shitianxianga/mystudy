package suanfa;

import java.util.HashSet;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/12/24 16:09
 * @updateDate 2020/12/24 16:09
 **/
public class 链表相交 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode node=headA;
        HashSet<ListNode> nodes=new HashSet<>();
        while (node!=null)
        {
           nodes.add(node);
           node=node.next;
        }
        while (headB!=null)
        {
            if (nodes.contains(headB))
            {
                return  headB;
            }
            headB=headB.next;
        }
        return null;
    }
}
