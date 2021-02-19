package suanfa;

import com.sun.javaws.IconUtil;
import com.sun.javaws.jnl.RContentDesc;

public class Fibonacci {
    //第一种递归，时间效率很低。T(n)=F(n-1)+F(n-2)+3 基本上和Fn的速度持平了
    public  static  int  fib(int n)
    {
        if (n==0)
        {
            return 0;
        }
        if (n==1)
        {
            return 1;
        }
        return  fib(n-1)+fib(n-2);
    }
    //第二种循环，Tn时间可以和n成线性比
    public  static int fib2(int n)
    {
        int f[]=new int[n];
        f[0]=0;f[1]=1;
        for (int i=2;i<=n;i++)
        {
            f[i]=f[i-1]+f[i-2];
        }
        return  f[n];
    }
    public static void main(String[] args) {

        System.out.println(fib(5));

    }
}
