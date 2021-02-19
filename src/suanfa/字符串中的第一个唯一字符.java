package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/12/23 8:54
 * @updateDate 2020/12/23 8:54
 **/
public class 字符串中的第一个唯一字符 {
    public int firstUniqChar(String s) {

        int[] num=new int[26];
        for (int i=0;i<s.length();i++)
        {
            num[s.charAt(i)-'a']++;
        }
        for (int i=0;i<s.length();i++)
        {
            if (num[s.charAt(i)-'a']==1)
            {
                return i;
            }
        }
        return -1;
    }
}
