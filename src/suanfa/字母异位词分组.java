package suanfa;

import java.util.*;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/12/14 9:45
 * @updateDate 2020/12/14 9:45
 **/
public class 字母异位词分组 {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] ss=new String[strs.length];
        for (int j=0;j<strs.length;j++)
        {
            ss[j]=new String(strs[j]);
        }
        List<List<String>> lists=new ArrayList<>();
        List<String> list= Arrays.asList(strs);
        Set<String> set=new HashSet<>();
        for (int i=0;i<list.size();i++) {
            char[] c=list.get(i).toCharArray();
            Arrays.sort(c);
            String s=new String(c);
            if (!set.contains(s))
            {
                set.add(s);
            }
            list.set(i,s);
        }
        for (String s:set)
        {
            List<String> list1=new ArrayList<>();
            for (int i=0;i<list.size();i++)
            {
                if (s.equals(list.get(i)))
                {
                    list1.add(ss[i]);
                }
            }
            lists.add(list1);
        }
        return lists;

    }
}
