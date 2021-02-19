package suanfa;

import java.util.HashMap;
import java.util.Map;

public class leetCode5 {
    public int superEggDrop(int K, int N) {

    return dp(K,N);
    }
    Map<Integer,Integer> map=new HashMap<>();
    int dp(int K,int N)
    {
        if (map.containsKey(N*100+K)) {
            int ans;
            if (N == 0) {
                ans=0;
            }
            else if (K==1)
            {
                ans=N;
            }
            else
            {
                int lo=1; int hi=N;
                while (lo+1<N)
                {
                    int x=(lo+hi)/2;
                    int t1=dp(lo,N-x);
                    int t2=dp(lo-1,x-1);
                    if (t1>t2)
                    {
                        lo=x;
                    }
                    else  if (t1<t2)
                    {
                        hi=x
;                    }
                    else
                    {
                        hi=lo=x;
                    }
                }
                ans=1+Math.min(Math.max(dp(K-1,lo-1),
                        dp(K,N-lo)),Math.max(dp(K-1,hi-1),dp(K,N-hi)));
            }
            map.put(N*100+K,ans);
        }
        return map.get(N*100+K);
    }
}
