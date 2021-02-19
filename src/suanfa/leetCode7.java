package suanfa;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.*;

/**
 *给定一个字符串 s，将 s 分割成一些子串，使每个子串都是回文串。
 *
 * 返回 s 所有可能的分割方案。
 *
 * 示例:
 *
 * 输入: "aab"
 * 输出:
 * [
 *   ["aa","b"],
 *   ["a","a","b"]
 * ]
 */
public class leetCode7 {
    public List<List<String>> partition(String s) {
        List<List<String>> lists=new ArrayList<>();
        if (s.length()==0)
        {
            return  lists;
        }
        int len=s.length();
        Deque stack=new ArrayDeque<>();
        add(s,0,len,lists,stack);
        return lists;
    }
    public void   add(String s,int start,int len,List<List<String>> lists,Deque deque)
    {
        if (start==len)
        {
            lists.add(new ArrayList<>(deque));
            return ;
        }
        for (int i=start;i<len;i++)
        {
            if (!isPalindrome(s.substring(start,i)))
            {
                continue;
            }
            deque.addLast(s.substring(start,i));
            add(s,i+1,len,lists,deque);
            deque.removeLast();
        }

    }
    public static boolean isPalindrome(String s) {
        if (s.length()==1) {
            return  true;
        }
        int i,j=s.length()-1;
        for (i=0;i<j;i++)
        {
            if (s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            j--;
        }
        return  true;
    }
}
