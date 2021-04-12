package fxsuanfa;

import java.util.*;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/25 10:53
 * @updateDate 2021/3/25 10:53
 **/
public class 括号生成 {
    List<String> list=new ArrayList<>();
    public List<String> generateParenthesis(int n) {

        dfs(new StringBuilder(),n,0,0);
        return list;
    }
    public void  dfs(StringBuilder s,int n,int left,int right){
        if (s.length()==2*n)
        {
           list.add(s.toString());
        }
        if (left<n)
        {
            s.append('(');
            dfs(s,n,left+1,right);
            s.deleteCharAt(s.length()-1);
        }
        if (right<n)
        {
            s.append(')');
            dfs(s,n,left,right+1);
            s.deleteCharAt(s.length()-1);
        }
    }

}
