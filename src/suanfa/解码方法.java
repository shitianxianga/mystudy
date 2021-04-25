package suanfa;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/21 9:30
 * @updateDate 2021/4/21 9:30
 **/
public class 解码方法 {
    public int numDecodings(String s) {
      int [] dp=new int[s.length()];
      dp[0]=1;
      if (s.length()==0||s.charAt(0)=='0')
      {
          return 0;
      }
      for (int i=1;i<s.length();i++)
      {
          if (s.charAt(i)!=0)
          {
              dp[i]+=dp[i-1];
          }
          if (i>1&&s.charAt(i-1)!=0&&s.charAt(i-1)<3&&s.charAt(i)<7)
          {
              dp[i+1]+=dp[i-1];
          }
      }
      return dp[s.length()-1];

    }
  /*
   暴力解法 超时
   public void dfs(int index,String s)
    {
        if (index==s.length())
        {
            count++;
            return;
        }
        if (index>s.length())
        {
            return;
        }

        if (s.charAt(index)!='0')
        {
            dfs(index+1,s);
            if (index<s.length()-1&&Integer.valueOf(s.substring(index,index+2))<=26)
            {
                dfs(index+2,s);
            }
        }
    }*/
}
