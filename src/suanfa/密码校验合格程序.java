package suanfa;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/2 15:44
 * @updateDate 2021/4/2 15:44
 **/
public class 密码校验合格程序 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.next();
            int D = 0;
            int X = 0;
            int N = 0;
            int O = 0;
            if (s.length() < 9) {
                System.out.println("NG");
            } else {
                for (int i = 0; i < s.length(); i++) {
                    if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z' ) {
                        D = 1;
                    } else if ('a' <= s.charAt(i) && s.charAt(i) <= 'z' ) {
                        X = 1;
                    } else if (Character.isDigit(s.charAt(i))) {
                        N = 1;
                    } else {
                        O = 1;
                    }
                }
                if (N + O + X + D < 3) {
                    System.out.println("NG");
                    continue;
                }
                if (getString(s, 0, 3)) {
                    System.out.println("NG");
                } else {
                    System.out.println("OK");
                }
            }
        }
    }
    private static boolean getString(String str,int l,int r) {
        if (r>=str.length()) {
            return false;
        }
        if (str.substring(r).contains(str.substring(l, r))) {
            return true;
        } else {
            return getString(str,l+1,r+1);
        }
    }
}
