package suanfa;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/1/29 9:25
 * @updateDate 2021/1/29 9:25
 **/
public class 最小体力消耗路径 {
    public static int minimumEffortPath(int[][] heights) {
        List<Integer> list=new ArrayList<>();
        boolean[][]flag=new  boolean[heights.length][heights[0].length];

        dfs(0,0,heights,flag,0,0,list);
        return list.get(list.size()-1);
    }
    public static   void dfs(int i,int j,int [][] nums,boolean [][]flag,int max,int temp,List<Integer> list)
    {
        if (i<0||i>=flag.length||j<0||j>=flag[0].length)
        {
            return;
        }
        if (i==flag.length-1&&j==flag[0].length-1)
        {
            if (list.size()>0)
            {
                if (list.get(list.size()-1)>temp)
                {
                    list.add(temp);
                }
            }
            else
            {
                list.add(temp);
            }
        }
            if (i-1>=0&&!flag[i-1][j])
            {
            int a=temp;
            temp=Math.max(temp,Math.abs(nums[i][j]-nums[i-1][j]));
            flag[i-1][j]=true;
            dfs(i-1,j,nums,flag,max,temp,list);
            temp=a;
            flag[i-1][j]=false;
        }
            if (i+1<flag.length&&!flag[i+1][j])
            {
                int a=temp;
                temp=Math.max(temp,Math.abs(nums[i][j]-nums[i+1][j]));
                flag[i+1][j]=true;
                dfs(i+1,j,nums,flag,max,temp,list);
                temp=a;
                flag[i+1][j]=false;
            }
            if (j+1<flag[0].length&&!flag[i][j+1])
            {
                int a=temp;
                temp=Math.max(temp,Math.abs(nums[i][j]-nums[i][j+1]));
                flag[i][j+1]=true;
                dfs(i,j+1,nums,flag,max,temp,list);
                temp=a;
                flag[i][j+1]=false;
            }
            if (j-1>=0&&!flag[i][j-1])
            {
                int a=temp;
                temp=Math.max(temp,Math.abs(nums[i][j]-nums[i][j-1]));
                flag[i][j-1]=true;
                dfs(i,j-1,nums,flag,max,temp,list);
                temp=a;
                flag[i][j-1]=false;
            }
    }

    public static void main(String[] args) {

        int [][] ints=new int[][]{{1,2,2},{3,8,2},{5,3,5}};
        minimumEffortPath(ints);
    }
}
