package suanfa;


import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/11/17 9:17
 * @updateDate 2020/11/17 9:17
 **/
public class 距离顺序排列矩阵单元格 {
    //排序做法
    /*public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        List<int[]> list=new ArrayList<>();
        for (int i=0;i<=R;i++)
        {
            for (int j=0;j<=C;j++)
            {
                list.add(new int[]{i,j});
            }
        }
        list.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (Math.abs(o1[0]-r0)+Math.abs(o1[1]-c0))-(Math.abs(o2[0]-r0)+Math.abs(o2[1]-c0));
            }
        });
        int[][] ans=new int[list.size()][2];
        for (int i=0;i<list.size();i++)
        {
            ans[i]=list.get(i);
        }
        return ans;
    }*/


    //bfs做法
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        Queue<int[]> queue=new LinkedList<>();
        boolean[][] mark = new boolean[R][C];
        mark[r0][c0]=true;
        List<int[]> list=new ArrayList<>();
        queue.offer(new int[]{r0,c0});
        int [][] dirs=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        while (!queue.isEmpty())
        {
            int size=queue.size();
            int[] temp=queue.poll();
            list.add(temp);
            for (int i=0;i<size;i++)
            {
                for (int[] dir:dirs)
                {
                    int x=temp[0]+dir[0];
                    int y=temp[1]+dir[1];
                    if (x>=0&&x<R&&y>0&&y<C&&!mark[x][y])
                    {
                        queue.offer(new int[]{x,y});
                        mark[x][y]=true;
                    }
                }
            }
        }
        return list.toArray(new int[0][]);

    }
}
