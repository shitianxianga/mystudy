package suanfa;

import java.util.*;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/1/21 9:13
 * @updateDate 2021/1/21 9:13
 **/
public class 找到最小生成树里的关键边和伪关键边 {
    public List<List<Integer>> findCriticalAndPseudoCriticalEdges(int n, int[][] edges) {
        List<Edge> list=new ArrayList<>();
        for (int i=0;i<edges.length;i++)
        {
            list.add(new Edge(edges[i][0],edges[i][1],i,edges[i][2]));
        }
        list.sort(new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return o1.len-o2.len;
            }
        });
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> fb=new ArrayList<>();
        List<Integer> bx=new ArrayList<>();
        int j=0;
        for (int i=0;i<list.size();i++)
        {

            if (list.get(i).len>list.get(n-1).len)
            {
                j=i-1;
                break;
            }
            if (map.containsKey(list.get(i).len))
            {
                map.put(list.get(i).len,map.get(list.get(i).len+1));
                fb.add(list.get(i).index);
            }
            else
            {
                map.put(list.get(i).len,1);
            }
        }
        for (int i=0;i<=j;i++)
        {
            if (map.get(list.get(i).len)==1)
            {
                bx.add(list.get(i).index);
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(bx);
        ans.add(fb);
        return  ans;

    }
    class Edge{
        private int start;
        private  int  end;
        private int index;
        private  int len;

        public Edge(int start, int end, int index, int len) {
            this.start = start;
            this.end = end;
            this.index = index;
            this.len = len;
        }
    }
    class UnionSet{
        private  int[] p;
        private int[] rank;
        public UnionSet(int length) {
            this.p= new int[length];
            for (int i=0;i<length;i++)
            {
                p[i]=i;
            }
            Arrays.fill(rank,1);
        }
        private int find(int x)
        {
            if (x==p[x])
            {
                return x;
            }
            return find(p[x]);
        }
        public  boolean  union(int x,int y)
        {
            int unionX=find(x);
            int unionY=find(y);
            if (unionX==unionY)
            {
                return false;
            }
            if (rank[unionX]==rank[unionY])
            {
                p[unionX]=unionY;
                rank[unionY]+=1;
            }
            else if (rank[unionX]<rank[unionY])
            {
                p[unionY]=unionX;
            }
           else
            {
                p[unionY]=unionX;
            }
           return true;
        }
    }
}
