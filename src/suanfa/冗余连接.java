package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/1/13 9:08
 * @updateDate 2021/1/13 9:08
 **/
public class 冗余连接 {
    public int[] findRedundantConnection(int[][] edges) {
        int length=edges.length;
        unionFind unionFind=new unionFind(length);
        for (int i=0;i<length;i++)
        {
            int[] edge=edges[i];
            int node1=edge[0];int node2=edge[1];
            if (unionFind.find(node1)!=unionFind.find(node2))
            {
                unionFind.union(node1,node2);
            }
            else
            {
                return edge;
            }
        }
        return new int[0];

    }
    public  class  unionFind{
        private int[] parent;

        public unionFind(int length) {
            this.parent = new int[length];
            for (int i=0;i<length;i++)
            {
                parent[i]=i;
            }
        }

        public int find(int x)
        {
            if (x==parent[x])
            {
                return x;
            }
            return find(parent[x]);
        }
        public void  union(int x,int y)
        {
            int unionX=find(x);
            int unionY=find(y);
            parent[unionX]=unionY;
        }
    }

}
