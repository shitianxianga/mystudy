package fxsuanfa;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/25 11:17
 * @updateDate 2021/3/25 11:17
 **/
public class 合并K个升序链表 {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> listNodes=new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val-o2.val;
            }
        });
        for (ListNode node:lists)
        {
            while (node!=null)
            {
                listNodes.add(node);
                node=node.next;
            }
        }
        ListNode node=new ListNode(-1);
        ListNode pre =node;
        while (!listNodes.isEmpty())
        {
            pre.next=listNodes.poll();
            pre=pre.next;
        }
        pre.next=null;
        return node.next;
    }
}
