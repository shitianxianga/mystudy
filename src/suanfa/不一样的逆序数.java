package suanfa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/2/25 9:12
 * @updateDate 2021/2/25 9:12
 **/
public class 不一样的逆序数 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        List<int[]> list=new ArrayList<>();

        for (int i=num;i>10000;i--)
        {
            if (i%4==0)
            {
                if (check(i/4,i))
                {
                    int[] nums={i/4,i};
                    list.add(nums);
                }
            }
        }
        if (num>=8712)
        {
            int[] nums={2178,8712};
            list.add(nums);
        }
        System.out.println(list.size());
        for (int i=list.size()-1;i>=0;i--)
        {
            int [] nums=list.get(i);
            System.out.println(nums[0]+" "+nums[1]);
        }
    }
    public static boolean check(int a,int b)
    {
        String s1=String.valueOf(a);
        String s2=String.valueOf(b);
        if (s1.length()!=s2.length())
        {
            return false;
        }
        for (int i=0;i<s1.length();i++)
        {
            if (s1.charAt(i)!=s2.charAt(s1.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }
}
