package suanfa;

import java.util.*;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/1/11 9:24
 * @updateDate 2021/1/11 9:24
 **/
public class 交换字符串中的元素 {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        char[] chars=s.toCharArray();
        UnionFind unionFind=new UnionFind(s.length());
        Map<Integer,PriorityQueue<Character>> map=new HashMap<>();
        for (List<Integer> list:pairs)
        {
            unionFind.union(list.get(0),list.get(1));
        }
        for (int i=0;i<chars.length;i++)
        {
            int x=unionFind.find(i);
            if (map.containsKey(x))
            {
                map.get(x).offer(chars[i]);
            }
            else {
                // PriorityQueue<Character> minHeap = new PriorityQueue<>();
                // minHeap.offer(charArray[i]);
                // hashMap.put(root, minHeap);
                // 上面三行代码等价于下面一行代码，JDK 1.8 以及以后支持下面的写法
                map.computeIfAbsent(x, key -> new PriorityQueue<>()).offer(chars[i]);
            }
        }

        // 第 3 步：重组字符串
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int root = unionFind.find(i);
            stringBuilder.append(map.get(root).poll());
        }
        return stringBuilder.toString();


    }

    public class  UnionFind{
        private  int[] parent;
        private  int[] rank;

        public UnionFind(int length) {
            this.parent = new int[length];
            for (int i=0;i<length;i++)
            {
                parent[i]=i;
                rank[i]=1;
            }
        }
        public void  union(int x,int y)
        {
            int parentX=find(x);
            int parentY=find(y);
            if (parentX==parentY)
            {
                return;
            }
            if (rank[parentX]==rank[parentY])
            {
                parent[parentX]=parentY;
                rank[parentY]++;
            }
            else if (rank[parentX]>rank[parentY])
            {
                parent[parentY]=parentX;

            }
            else
            {
                parent[parentX]=parentY;
            }
        }
        public int find(int x)
        {
            while (x!=parent[x])
            {
                x=parent[x];
            }
            return x;
        }
    }

}
