package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/15 16:38
 * @updateDate 2021/3/15 16:38
 **/
public class 仅执行一次字符串交换能否使两个字符串相等 {
    public boolean areAlmostEqual(String s1, String s2) {

        if (s1.length()!=s2.length())
        {
            return false;
        }
        int num=0;
        int a=0;
        int b=0;
        for (int i=0;i<s1.length();i++)
        {
            if (s1.charAt(i)!=s2.charAt(i))
            {
                if (a==0)
                {
                    a=i;
                }
                else
                {
                    b=i;
                }
                num++;
                if (num>2)
                {
                    return false;
                }
            }
        }
        if (num==0)
        {
            return true;
        }
        if (num==1)
        {
            return false;
        }
        char[] chars=s1.toCharArray();
        chars[a]=s1.charAt(b);
        chars[b]=s1.charAt(a);
        String ans=new String(chars);
        return  ans.equals(s2);


    }
}
