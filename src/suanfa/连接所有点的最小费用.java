package suanfa;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/1/19 10:26
 * @updateDate 2021/1/19 10:26
 **/
public class 连接所有点的最小费用 {

    public static int minCostConnectPoints(int[][] points) {
        int n=points.length;
        List<Edge> edges=new ArrayList<>();
        UnionSet set=new UnionSet(n);
        for (int i=0;i<n;i++)
        {
            for (int j=i;j<n;j++)
            {
                edges.add(new Edge(i,j,dist(points,i,j)));
            }
        }
        edges.sort(new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return o1.len-o2.len;
            }
        });
        int ans=0;
        int count=1;
        for (Edge edge:edges)
        {
            if (set.union(edge.x,edge.y))
            {
                ans+=edge.len;
                count++;
            }
            if (count==n)
            {
               break;
            }
        }
        return  ans;
    }
    static int dist(int[][] points,int i,int j)
    {
        return Math.abs(points[i][0]-points[j][0])+Math.abs(points[i][1]-points[j][1]);
    }
    static  class  Edge{
        private  int x,y,len;

        public Edge(int x, int y, int len) {
            this.x = x;
            this.y = y;
            this.len = len;
        }
    }
    static class UnionSet{
        private int[] p;
        private int[] rank;

        public UnionSet(int length) {
            this.p = new int[length];
            for (int i=0;i<p.length;i++)
            {
                p[i]=i;
            }
            this.rank = new int[length];
            Arrays.fill(rank,1);
        }
        public boolean union(int x,int y)
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
                unionX++;
            }
            else  if (rank[unionX]<rank[unionY])
            {
                p[unionY]=unionX;
            }
            else
            {
                p[unionX]=unionY;
            }
            return  true;
        }
        public int find(int x)
        {
            if (x==p[x])
            {
                return x;
            }
            return find(p[x]);
        }
    }
    public static void main(String[] args) {
        int[][] points=new int[][]{{0,0},{2,2},{3,10},{5,2},{7,0}};
        minCostConnectPoints(points);
    }
}
