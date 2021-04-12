package fxsuanfa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/24 14:47
 * @updateDate 2021/3/24 14:47
 **/
public class 电话号码的字母组合 {
    Map<String,char[]> map=new HashMap<>();
    List<String> list=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        map.put("2",new char[]{'a','b','c'});
        map.put("3",new char[]{'d','e','f'});
        map.put("4",new char[]{'g','h','i'});
        map.put("5",new char[]{'j','k','l'});
        map.put("6",new char[]{'m','n','o'});
        map.put("7",new char[]{'p','q','r','s'});
        map.put("8",new char[]{'t','u','v'});
        map.put("9",new char[]{'w','x','y','z'});
        dfs(digits,0,new StringBuilder());
        return list;
    }
    public void dfs(String digits,int index,StringBuilder s)
    {
        if (s.length()==digits.length())
        {
             list.add(new String(s));
             return;
        }
        char[] temp=map.get(""+digits.charAt(index));
        for (int i=0;i<temp.length;i++)
        {
            s.append(temp[i]);
            dfs(digits,index+1,s);
            s.deleteCharAt(i);
        }
    }

}
