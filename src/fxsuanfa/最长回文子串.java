package fxsuanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/23 19:32
 * @updateDate 2021/3/23 19:32
 **/
public class 最长回文子串 {
    public String longestPalindrome(String s) {

        int max=0;
        String ans="";
        for (int i=0;i<s.length();i++)
        {
            int l=i-1;
            int r=l+1;

            while (l>0&&r<s.length())
            {
                if (s.charAt(l)==s.charAt(r))
                {
                   if (max<l-r)
                   {
                       ans=s.substring(l,r);
                   }
                    l--;
                    r++;
                }
                else
                {
                    break;
                }
            }
        }
        return ans;
    }
}
