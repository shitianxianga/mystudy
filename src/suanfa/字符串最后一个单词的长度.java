package suanfa;

import java.util.Scanner;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/1 17:08
 * @updateDate 2021/4/1 17:08
 **/
public class 字符串最后一个单词的长度 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String ss=scanner.nextLine();
        int start=0;
        for (int i=ss.length()-1;i>=0;i--)
        {
            if (start==0&&ss.charAt(i)!=' ')
            {
                start=i;
            }
            if (start!=0&&ss.charAt(i)==' ')
            {
                System.out.println(start-i);
                return;
            }
        }
    }
}
