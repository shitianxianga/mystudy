package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/2/5 9:34
 * @updateDate 2021/2/5 9:34
 **/
public class 尽可能使字符串相等 {
    public int equalSubstring(String s, String t, int maxCost) {
        int  left=0;
        int right=0;
        while (right<s.length())
        {
            int abs=Math.abs(s.charAt(right)-t.charAt(right));
            if (abs<=maxCost)
            {
                maxCost-=abs;
            }
            else
            {
                maxCost+=Math.abs(s.charAt(left)-t.charAt(left));
                maxCost-=abs;
                left++;
            }
            right++;
        }
        return right-left;
    }
}
