package suanfa;

import java.util.*;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/1/15 14:28
 * @updateDate 2021/1/15 14:28
 **/
public class LRU {
    public int[] LRU (int[][] operators, int k) {
        // write code here
        Lru lru=new Lru(k);
        List<Integer>list=new ArrayList<>();
        for (int i=0;i<operators.length;i++)
        {
            if (operators[i].length==3)
            {
                lru.set(operators[i][1],operators[i][2]);
            }
            else {
                 list.add(lru.get(operators[i][1]));
            }
        }
        int [] ans=new int[list.size()];
        int i=0;
        for (Integer a:list )
        {
            ans[i++]=a;
        }
        return ans ;
    }
     class Lru{
        public int count=0;
        public  int length=0;
        public Map<Integer,Integer> map;
        public Queue<Integer> queue;
        public Lru(int k) {
            this.map = new HashMap<>();
            queue= new LinkedList<>();
            length=k;
        }
        public void set(int i,int num)
        {
            count++;
            if (count>length)
            {
                map.remove(queue.poll());
            }
            map.put(i,num);
            queue.remove(i);
            queue.add(i);

        }
        public int get(int i)
        {
            if (map.containsKey(i))
            {
                return  map.get(i);
            }
        return  -1;
        }
    }
}
