package suanfa;

import java.util.Map;
import java.util.Scanner;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/2 14:05
 * @updateDate 2021/4/2 14:05
 **/
public class 购物清单 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int M=scanner.nextInt();
        int [][]dp=new int[M+1][N+1];
        Good[] goods=new Good[M+1];
        for (int i=1;i<=M;i++)
        {
            Good good=new Good();
            good.v=scanner.nextInt();
            good.p=scanner.nextInt();
            good.q=scanner.nextInt();
            goods[i]=good;
            if (good.q!=0)
            {
                if (goods[good.q].fj1==0) {
                    goods[good.q].fj1 = i;
                }else
                {
                    goods[good.q].fj2=i;
                }
            }
        }
        for (int i=1;i<=N;i++)
        {
            int v1=0,v2=0,v3=0,tempdp=0,tempdp1=0,tempdp2=0,tempdp3=0;;
            Good good=goods[i];
            int v=good.v;
            tempdp=good.p*v;
            if (good.fj1==0&&good.fj2!=0)
            {
                v1=good.v+goods[good.fj2].v;
                tempdp1=tempdp+goods[good.fj2].v*goods[good.fj2].p;
            }
            else if (good.fj1!=0&&good.fj2==0)
            {
                v2=good.v+goods[good.fj1].v;
                tempdp2=tempdp+goods[good.fj1].v*goods[good.fj1].p;
            }
            else if (good.fj1!=0&&good.fj2!=0)
            {
                v3=good.v+goods[good.fj1].v+goods[good.fj2].v;
                tempdp3=tempdp+goods[good.fj2].v*goods[good.fj2].p+goods[good.fj1].v*goods[good.fj1].p;
            }
            for (int j=1;j<=N;j++)
            {
                if (good.q!=0)
                {
                    dp[i][j]=dp[i-1][j];
                }
                else
                {
                    dp[i][j] = dp[i-1][j];
                    if (j>=v&&v!=0)
                    {
                        dp[i][j]= Math.max(dp[i][j],dp[i-1][j-v]+tempdp);
                    }

                    if (j>=v1&&v1!=0)
                    {
                        dp[i][j]= Math.max(dp[i][j],dp[i-1][j-v1]+tempdp1);
                    }
                    else if (j>=v2&&v2!=0)
                    {
                        dp[i][j]= Math.max(dp[i][j],dp[i-1][j-v2]+tempdp2);
                    }
                    else if (j>=v3&&v3!=0)
                    {
                        dp[i][j]= Math.max(dp[i][j],dp[i-1][j-v3]+tempdp3);
                    }
                }
            }

        }
        System.out.println(dp[M][N]);
    }
    static class Good{
        public int v;
        public int p;
        public int q;
        public int fj1=0;
        public int fj2=0;
    }
}
