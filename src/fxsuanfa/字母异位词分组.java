package fxsuanfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/26 15:34
 * @updateDate 2021/3/26 15:34
 **/
public class 字母异位词分组 {
    public List<List<String>> groupAnagrams(String[] strs) {
        boolean[] flag=new boolean[strs.length];
        List<List<String>>lists=new ArrayList<>();
        for (int i=0;i<strs.length;i++)
        {
            if (!flag[i]) {
                List<String> list=new ArrayList<>();
                list.add(strs[i]);
                for (int j = i + 1; j < strs.length; j++) {
                    if (!flag[i]) {
                        if (isSame(strs[i], strs[j])) {
                            list.add(strs[j]);
                        }
                    }
                }
                lists.add(list);
            }
        }
        return lists;

    }
    boolean isSame(String s,String b)
    {
        int[] hash=new int[26];
        if (s.length()!=b.length())
        {
            return false;
        }
        for (int i=0;i<s.length();i++)
        {
            hash[s.charAt(i)-'a']+=1;
            hash[b.charAt(i)-'a']-=1;
        }
        for (int i=0;i<26;i++)
        {
            if (hash[i]!=1)
            {
                return false;
            }
        }
        return true;

    }
}
