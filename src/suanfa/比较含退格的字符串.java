package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/10/19 9:10
 * @updateDate 2020/10/19 9:10
 **/
public class 比较含退格的字符串 {
    public static boolean backspaceCompare(String S, String T) {
        StringBuilder s1=new StringBuilder(S);
        StringBuilder t1=new StringBuilder(T);
        for (int i=0;i<s1.length();i++)
        {
            if (s1.charAt(i)=='#'&&i!=0)
            {
                s1.deleteCharAt(i-1);
                i--;
                s1.deleteCharAt(i);
                i--;
            }
            if (i==0&&s1.charAt(i)=='#')
            {
                s1.deleteCharAt(0);
                i--;
            }
        }
        for (int i=0;i<t1.length();i++)
        {
            if (t1.charAt(i)=='#'&&i!=0)
            {
                t1.deleteCharAt(i-1);
                i--;
                t1.deleteCharAt(i);
                i--;
            }
            if (i==0&&t1.charAt(i)=='#')
            {
                t1.deleteCharAt(0);
                i--;
            }
        }
        return s1.toString().equals(t1.toString());
    }

    public static void main(String[] args) {
        backspaceCompare("j##xfix",
                "j###xfix");
        Double d=new Double(2);
        Math.pow(2.0,d);
    }
}
