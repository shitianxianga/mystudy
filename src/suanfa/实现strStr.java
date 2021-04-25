package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/20 9:51
 * @updateDate 2021/4/20 9:51
 **/
public class 实现strStr {
    public int strStr(String haystack, String needle) {

        if ("".equals(needle))
        {
            return 0;
        }
        int[] pi=new int[needle.length()];
        for(int i=1,j=0;i<needle.length();i++)
        {
            while (j>0&&needle.charAt(i)!=needle.charAt(j))
            {
                j=pi[j-1];
            }
            if (needle.charAt(i)==needle.charAt(j))
            {
                j++;
            }
            pi[i]=j;
        }
        for (int i=0,j=0;i<haystack.length();i++)
        {
            while (j>0&&needle.charAt(j)!=haystack.charAt(i))
            {
                j=pi[j-1];
            }
            if (needle.charAt(j)==haystack.charAt(i)) {
                j++;
            }
            if (j==needle.length())
            {
                return j-needle.length()+1;
            }
        }
        return -1;
    }
}
