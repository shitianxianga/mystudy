package suanfa;

import java.util.Map;
import java.util.Scanner;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/1 17:16
 * @updateDate 2021/4/1 17:16
 **/
public class 计算字符出现次数 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String s1=scanner.next();
        int [] dict=new int[300];
        for (int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                dict[s.charAt(i)]++;
            }
        }
        System.out.println(s1.charAt(0)-'A'+'a');
        if (s1.charAt(0)>'Z') {
            System.out.println(dict[s1.charAt(0)] + dict[s1.charAt(0) + 'A' - 'a']);
        }
        else
        {
            System.out.println(dict[s1.charAt(0)]+dict[s1.charAt(0)-'A'+'a']);
        }

    }
}
