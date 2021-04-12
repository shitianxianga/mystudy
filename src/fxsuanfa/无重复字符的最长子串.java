package fxsuanfa;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/23 17:27
 * @updateDate 2021/3/23 17:27
 **/
public class 无重复字符的最长子串 {

        public static int lengthOfLongestSubstring(String s) {
            Map<String,Integer> map=new HashMap<>();
            int left=0;
            int right=0;
            int max=0;
            while (right<s.length())
            {
                if (!map.containsKey(""+s.charAt(right)))
                {
                    map.put(""+s.charAt(right),right);
                }
                else
                {
                    left=map.get(""+s.charAt(right))+1;
                   for (int i=0;i<left;i++)
                   {
                       map.remove(""+s.charAt(i));
                   }
                    map.put(""+s.charAt(right),right);
                }
                max=Math.max(max,right-left+1);
                right++;
            }
            return max;
        }

    public static void main(String[] args) {
        String a="123123423";
        lengthOfLongestSubstring(a);
    }
}
