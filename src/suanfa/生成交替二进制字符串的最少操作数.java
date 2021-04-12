package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/17 10:16
 * @updateDate 2021/3/17 10:16
 **/
public class 生成交替二进制字符串的最少操作数 {
    class Solution {
        public int minOperations(String s) {
            char[] sChars = s.toCharArray();
            int length = sChars.length;
            int count1 = 0;
            int count2 = 0;
            // (i & 1) == 0 说明 i 为偶数
            // 解释：
            // 先将i 和 1转换成二进制
            // 然后对应位置的数
            // 两个只要有一个是0,结果就为等于0
            //两个都是1结果为1
            // (0 0 -> 0 | 0 1 -> 0 | 1 1 -> 1)
            for (int i = 0; i < length; i++) {
                if ((i & 1) == 0) {
                    if (sChars[i] == '0') {
                        count1++;
                    } else {
                        count2++;
                    }
                } else {
                    if (sChars[i] == '1') {
                        count1++;
                    } else {
                        count2++;
                    }
                }
            }
            return count1 < count2 ? count1 : count2;
        }
    }

}

