package fxsuanfa;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/23 16:49
 * @updateDate 2021/3/23 16:49
 **/
class  ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class 两数相加 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        List<Integer> list=new ArrayList<>();
        while (l1==null&&l2==null)
        {
            if (l1==null)
            {
                list.add(l2.val);
                l2=l2.next;
            }
            else if (l2==null)
            {
                list.add(l1.val);
                l1=l1.next;
            }
            else
            {
                list.add(l1.val+l2.val);
                l1=l1.next;
                l2=l2.next;
            }
        }
        for (int i=0;i<list.size()-1;i++)
        {
            if (list.get(i)>9)
            {
                list.set(i,list.get(i)-10);
                list.set(i+1,list.get(i+1)+1);
            }
        }
        int a=list.get(list.size()-1);
        ListNode ans=new ListNode();
        ListNode node=ans;
        for (int i=0;i<list.size()-1;i++)
        {
            ListNode node1=new ListNode();
            node1.val=list.get(i);
            node.next=node1;
            node=node.next;
        }
        node.next=new ListNode(a%10);
        node=node.next;
        int crr=a/10;
        if (crr>0)
        {
           node.next=new ListNode(crr);
        }
        return ans.next;
    }
}
