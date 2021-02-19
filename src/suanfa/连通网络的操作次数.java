package suanfa;

import java.util.Arrays;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/1/25 9:25
 * @updateDate 2021/1/25 9:25
 **/
public class 连通网络的操作次数 {
    public int makeConnected(int n, int[][] connections)
    {
        int count=0;
        int num=0;
        UnionSet set=new UnionSet(n);
        for (int i=0;i<connections.length;i++)
        {
            if (set.union(connections[i][0],connections[i][1]))
            {
                continue;
            }
            count++;
        }
       if (count<set.count)
       {
           return -1;
       }
      if (set.count==1)
      {
          return 0;
      }
      else
      {
          return set.count;
      }

    }
     class UnionSet{
        private int[] p;
        private int[] rank;
        public int count;
        public UnionSet(int length) {
            this.p = new int[length];
            for (int i=0;i<p.length;i++)
            {
                p[i]=i;
            }
            count=length;
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
                rank[unionX]++;
            }
            else  if (rank[unionX]<rank[unionY])
            {
                p[unionY]=unionX;
            }
            else
            {
                p[unionX]=unionY;
            }
            count--;
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
}
