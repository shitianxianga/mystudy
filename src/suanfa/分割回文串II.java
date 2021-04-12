package suanfa;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/8 9:23
 * @updateDate 2021/3/8 9:23
 **/
public class 分割回文串II {
    Integer min=Integer.MAX_VALUE;
    List<String> ans=new ArrayList<>();
    public int minCut(String s) {
        boolean[][] dp=new boolean[s.length()][s.length()];
        for (int i=0;i<s.length()-1;i++)
        {
            preDp(i,i,dp,s);
            preDp(i,i+1,dp,s);
        }
        dfs(0,dp,s);
        return min;

    }
    public void preDp(int i,int j,boolean[][] dp,String s)
    {
        while (i>=0&&j<s.length()&&s.charAt(i)==s.charAt(j))
        {
            dp[i][j]=true;
            i--;
            j++;
        }
    }
    public void dfs(int i,boolean[][]dp,String s)
    {
        if (i==s.length()-1)
        {
            min=Math.min(min,ans.size()-1);
        }
        for (int index=i;index<s.length();index++)
        {
            if (dp[i][index])
            {
                ans.add(s.substring(i,index));
                dfs(index+1,dp,s);
                ans.remove(ans.size()-1);
            }
        }
    }
}
