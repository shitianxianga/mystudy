package suanfa;

import java.util.Arrays;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/11/25 9:17
 * @updateDate 2020/11/25 9:17
 **/
public class 上升下降字符串 {
        public String sortString(String s) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            while (sb.length() != s.length()) {
                for (int i = 0; i < 26; i++) {
                    if (count[i] == 0) continue;
                    sb.append((char)('a' + i));
                    count[i]--;
                }
                for (int i = 25; i >= 0; i--) {
                    if (count[i] == 0) continue;
                    sb.append((char)('a' + i));
                    count[i]--;
                }
            }
            return sb.toString();
        }


}
