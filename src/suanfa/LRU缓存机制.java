package suanfa;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/2/23 14:46
 * @updateDate 2021/2/23 14:46
 **/
public class LRU缓存机制 {
    class LRUCache {
        class DlinkNode{
            int key;
            int val;
            DlinkNode next;
            DlinkNode prev;

            public DlinkNode(int key,int val) {
                this.val = val;
                this.key=key;
            }

            public DlinkNode() {
            }
        }
        Map<Integer,DlinkNode> map=new HashMap<>();
        int capacity;
        int size=0;
        DlinkNode head;
        DlinkNode tail;
        public LRUCache(int capacity) {
            this.capacity=capacity;
             head=new DlinkNode();
             tail=new DlinkNode();
            head.next=tail;
            tail.prev=head;
        }

        public int get(int key) {
            if (map.containsKey(key))
            {
                return map.get(key).val;
            }
            return -1;
        }
        public void put(int key, int value) {
            if (map.containsKey(key))
            {
                DlinkNode node=map.get(key);
                node.val=value;
                moveToHead(node);
            }
            else
            {
                DlinkNode node=new DlinkNode(key,value);
                map.put(key,node);
                addNode(node);
                size++;
                if (size==capacity)
                {
                    DlinkNode node1=removeTail();
                    map.remove(node1.key);
                    size--;
                }

            }
        }
        private void addNode(DlinkNode node)
        {
            node.prev=head.next;
            node.next=head.next;
            head.next.prev=node;
            head.next=node;
        }
        private void romveNode(DlinkNode node)
        {
            node.prev.next=node.next;
            node.next.prev=node.prev;
        }
        private void  moveToHead(DlinkNode node)
        {
            romveNode(node);
            addNode(node);
        }
        private DlinkNode removeTail()
        {
            DlinkNode node=tail.prev;
            romveNode(node);
            return node;
        }
    }
}
