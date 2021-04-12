package suanfa;

import java.util.*;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/26 17:17
 * @updateDate 2021/3/26 17:17
 **/
public class 公司食堂 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       int n=scanner.nextInt();
       int[] nums=new int[n];
       String ss[]=new String[n];
       int[] rnums=new int[n];
       String[] s1s=new  String[n];
       for (int i=0;i<n;i++) {
           nums[i] = scanner.nextInt();
          ss[i] = scanner.next();
           rnums[i]=scanner.nextInt();
          s1s[i]=scanner.next();
       }
       for(int i=0;i<n;i++)
       {
           String s=ss[i];
           String s1=s1s[i];
           PriorityQueue<Integer> k=new PriorityQueue<>();
           PriorityQueue<Integer> y=new PriorityQueue<>();
           for (int j=0;j<s.length();j++)
           {
               if (s.charAt(j)=='0')
               {
                   k.add(j+1);
               }
               if (s.charAt(j)=='1')
               {
                   y.add(j+1);
               }
           }
           for (int j=0;j<s1.length();j++)
           {
               if (s1.charAt(j)=='M')
               {
                   if (!y.isEmpty())
                   {
                       System.out.println(y.poll());
                   }
                   else
                   {
                       System.out.println(k.peek());
                       y.add(k.poll());
                   }
               }
               else
               {
                   if (!k.isEmpty())
                   {
                       System.out.println(k.peek());
                       y.add(k.poll());
                   }
                   else
                   {
                       System.out.println(y.poll());
                   }
               }
           }
       }
    }
}
