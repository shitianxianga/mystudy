package suanfa;

import java.util.Arrays;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/2/1 15:41
 * @updateDate 2021/2/1 15:41
 **/
public class 相似字符串组 {
    public int numSimilarGroups(String[] strs) {
        UnionSet set=new UnionSet(strs.length);
        for (int i=0;i<strs.length;i++)
        {
            for (int j=0;j<strs.length;j++)
            {
                if (i!=j&&isOk(strs[i],strs[j]))
                {
                    set.union(i,j);
                }
            }
        }
        return set.count;
    }
    boolean isOk(String a,String b)
    {
        int num=0;
        for (int i=0;i<a.length();i++)
        {
            if (a.charAt(i)!=b.charAt(i))
            {
                num++;
            }
        }
        if (num==0||num==2)
        {
            return true;
        }
        return false;
    }
    class UnionSet{
        private int[] p;
        private int[] rank;
        int count;
        public UnionSet(int length) {
            this.p = new int[length];
            for (int i=0;i<p.length;i++)
            {
                p[i]=i;
            }
            this.rank = new int[length];
            Arrays.fill(rank,1);
            count=length;
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
            count--;
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
