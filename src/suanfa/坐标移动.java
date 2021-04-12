package suanfa;

import javax.lang.model.element.NestingKind;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/2 15:06
 * @updateDate 2021/4/2 15:06
 **/
public class 坐标移动 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String[] ss=s.split(";");
        int left=0;
        int right=0;
        Set<Character> set=new HashSet<>();
        set.add('A');
        set.add('S');
        set.add('D');
        set.add('W');
        for (int i=0;i<ss.length;i++)
        {
            int length=ss[i].length();
            if (length<2||length>3||!set.contains(ss[i].charAt(0)))
            {
                continue;
            }
            String temp=ss[i].substring(1);
            char op=ss[i].charAt(0);
            boolean flag=true;
            for (char c:temp.toCharArray())
            {
                if (!Character.isDigit(c))
                {
                    flag=false;
                    break;
                }
            }
            if (flag)
            {
                if (op=='A')
                {
                    left-=Integer.parseInt(temp);
                }
                if (op=='W')
                {
                    right+=Integer.parseInt(temp);
                }
                if (op=='S')
                {
                    right-=Integer.parseInt(temp);
                }
                if (op=='D')
                {
                    left+=Integer.parseInt(temp);
                }
            }
        }
        System.out.println(left+","+right);
    }
}
