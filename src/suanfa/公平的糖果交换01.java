package suanfa;

import java.util.Arrays;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/2/1 9:01
 * @updateDate 2021/2/1 9:01
 **/
public class 公平的糖果交换01 {
    public int swimInWater(int[][] grid) {

        UnionSet set=new UnionSet(grid.length*grid[0].length);
        int t=0;
        while (true)
        {
            for (int i=0;i<grid.length;i++)
            {
                for (int j=0;j<grid[0].length;j++)
                {
                    if (grid[i][j]<=t&&grid[i+1][j]<=t)
                    {
                        set.union(i*grid[0].length+j,(i+1)*grid[0].length+j);
                    }
                    if (grid[i][j]<=t&&grid[i][j+1]<=t)
                    {
                        set.union(i*grid[0].length+j,i*grid[0].length+j+1);
                    }
                }
            }
            if (set.find(0)==set.find(grid.length*grid[0].length-1))
            {
                return t;
            }
        }
    }
    class UnionSet{
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
        public void union(int x,int y)
        {
            int unionX=find(x);
            int unionY=find(y);
            if (unionX==unionY)
            {
                return ;
            }
            if (rank[unionX]<rank[unionY]) {
                int temp=unionX;
                unionX=unionY;
                unionY=temp;
            }
            p[unionY]=unionX;
            rank[unionX]+=rank[unionY];
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
