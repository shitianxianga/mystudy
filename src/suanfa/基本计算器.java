package suanfa;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import org.bouncycastle.math.ec.custom.sec.SecT113Field;

import java.util.*;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/10 9:12
 * @updateDate 2021/3/10 9:12
 **/
public class 基本计算器 {


        class Solution {
            public int calculate(String s) {
                Deque<Integer> ops = new LinkedList<Integer>();
                ops.push(1);
                int sign = 1;

                int ret = 0;
                int n = s.length();
                int i = 0;
                while (i < n) {
                    if (s.charAt(i) == ' ') {
                        i++;
                    } else if (s.charAt(i) == '+') {
                        sign = ops.peek();
                        i++;
                    } else if (s.charAt(i) == '-') {
                        sign = -ops.peek();
                        i++;
                    } else if (s.charAt(i) == '(') {
                        ops.push(sign);
                        i++;
                    } else if (s.charAt(i) == ')') {
                        ops.pop();
                        i++;
                    } else {
                        long num = 0;
                        while (i < n && Character.isDigit(s.charAt(i))) {
                            num = num * 10 + s.charAt(i) - '0';
                            i++;
                        }
                        ret += sign * num;
                    }
                }
                return ret;
            }
        }


}
