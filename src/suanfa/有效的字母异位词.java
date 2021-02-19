package suanfa;

import java.util.Arrays;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/11/23 9:44
 * @updateDate 2020/11/23 9:44
 **/
public class 有效的字母异位词 {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length())
        {
            return false;
        }
        char[]s1=s.toCharArray();
        char[]t1=t.toCharArray();
        Arrays.sort(s1);Arrays.sort(t1);
        return Arrays.equals(s1,t1);
    }
}
