package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/1/7 9:24
 * @updateDate 2021/1/7 9:24
 **/
public class 省份数量 {
    int count=0;
    public int findCircleNum(int[][] isConnected) {
         unionFind unionFind=new unionFind(isConnected.length);
         int ans=0;
         for (int i=0;i<isConnected.length;i++)
         {
             for (int j=0;j<isConnected[0].length;j++)
             {
                 if (i!=j&&isConnected[i][j]==1)
                 {
                     unionFind.union(i,j);
                 }
             }
         }
         int count=0;
         for (int i=0;i<isConnected.length;i++)
         {
             if (unionFind.rank[i]>1)
             {
                 ans++;
                 count+=unionFind.rank[i];
             }
         }
         ans+=isConnected.length-count;
         return ans;
    }
   public class unionFind{
        private int[] parent;
        public int[] rank;

       public unionFind(int length) {
           this.parent = new int[length];
           this.rank=new int[length];
           for (int i=0;i<length;i++)
           {
               parent[i]=i;
               rank[i]=1;
           }
       }
       public int find(int x)
       {
           if (x==parent[x])
           {
               return x;
           }
         return   find(parent[x]);
       }
       public void  union(int x,int y)
       {
           int parentX=find(x);
           int parentY=find(y);
           if (parentX==parentY)
           {
               return;
           }
           if (rank[parentX]>rank[parentY])
           {
               parent[parentX]=parentY;
           }
           else if (rank[parentX]>rank[parentY])
           {
               parent[parentY]=parentX;

           }
           else
           {
               parent[parentX]=parentY;
               rank[parentY]++;
           }
       }
   }
}
