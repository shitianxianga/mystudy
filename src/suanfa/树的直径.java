package suanfa;

import java.util.*;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/1/14 15:32
 * @updateDate 2021/1/14 15:32
 **/
public class 树的直径 {
    static  int max=-1;
   static List<Integer> anss=new ArrayList<>();
    public static int solve (int n, Interval[] Tree_edge, int[] Edge_value) {
        // write code here
       Map<Integer,List<pair>> map=new HashMap<>();
        int a=0;
        for (int i=0;i<Tree_edge.length;i++)
        {
            if (map.containsKey(Tree_edge[i].start))
            {
                map.get(Tree_edge[i].start).add(new pair(Tree_edge[i].start,Edge_value[i],Tree_edge[i].end));
            }
            else
            {
                List<pair> list1=new ArrayList<>();
                list1.add(new pair(Tree_edge[i].start,Edge_value[i],Tree_edge[i].end));
                map.put(Tree_edge[i].start,list1);
            }
            if (map.containsKey(Tree_edge[i].end))
            {
                map.get(Tree_edge[i].end).add(new pair(Tree_edge[i].end,Edge_value[i],Tree_edge[i].start));
            }
            else
            {
                List<pair> list1=new ArrayList<>();
                list1.add(new pair(Tree_edge[i].end,Edge_value[i],Tree_edge[i].start));
                map.put(Tree_edge[i].end,list1);
            }
        }
        boolean[] flag=new boolean[n];
       int[] ans=new int[]{-1,0};
       dfs(map,flag,0,0,ans);
       dfs(map,flag,0,ans[1],ans);
        return ans[0];

    }
    public static   void  dfs(Map<Integer,List<pair>> map,boolean[] flag,int ans,int a,int[] anss)
    {
                if (ans!=0)
                {
                   if (anss[0]<ans)
                   {
                       anss[0]=ans;
                       anss[1]=a;
                   }
                }
                List<pair> list = map.get(a);
                for (pair pair : list) {
                    if (!flag[pair.end]) {
                        ans += pair.val;
                        flag[pair.start]=true;
                        dfs(map, flag, ans, pair.end,anss);
                        flag[pair.start]=false;
                        ans-=pair.val;
                    }
                }
            }


 static    class pair{
        int start;
        int val;
        int end;

        public pair(int start, int val, int end) {
            this.start = start;
            this.val = val;
            this.end = end;
        }
    }
   static class Interval {
        int start;
        int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) {

        int n=6;
        Interval[] m=new Interval[]{new Interval(0,1),new Interval(1,5),new Interval(1,2),new Interval(2,3),new Interval(2,4)};
        int[] c=new int[]{3,4,2,1,5};
        System.out.println(solve(n,m,c));

    }
}
