package suanfa;

import java.util.Arrays;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/1/27 9:35
 * @updateDate 2021/1/27 9:35
 **/
public class 保证图可完全遍历 {
    public int maxNumEdgesToRemove(int n, int[][] edges) {

        UnionSet set=new UnionSet(n);
        UnionSet set1=new UnionSet(n);
        int num=0;
        for (int i=0;i<edges.length;i++)
        {
            if (edges[i][0]==3)
            {
                set.union(edges[i][1],edges[i][2]);
                set1.union(edges[i][1],edges[i][2]);
                num++;
            }
        }
        for (int i=0;i<edges.length;i++)
        {
            if (edges[i][0]==1)
            {
                set.union(edges[i][1],edges[i][2]);
                num++;
            }
            if (edges[i][0]==2)
            {
                set1.union(edges[i][1],edges[i][2]);
                num++;
            }
        }
        if (set.count==1&&set1.count==1)
        {
            return n-num;
        }
        return -1;
    }

    class UnionSet {
        private int[] p;
        private int[] rank;
        public  int count;
        public UnionSet(int length) {
            this.p = new int[length];
            for (int i = 0; i < p.length; i++) {
                p[i] = i;
            }
            count=length;
            this.rank = new int[length];
            Arrays.fill(rank, 1);
        }

        public boolean union(int x, int y) {
            int unionX = find(x);
            int unionY = find(y);
            if (unionX == unionY) {
                return false;
            }
            if (rank[unionX] == rank[unionY]) {
                p[unionX] = unionY;
                rank[unionY]++;
            } else if (rank[unionX] < rank[unionY]) {
                p[unionY] = unionX;
            } else {
                p[unionX] = unionY;
            }
            count--;
            return true;
        }

        public int find(int x) {
            if (x == p[x]) {
                return x;
            }
            return find(p[x]);
        }
    }
}
