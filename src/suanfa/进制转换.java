package suanfa;

import java.util.WeakHashMap;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/1/18 10:33
 * @updateDate 2021/1/18 10:33
 **/
public class 进制转换 {
    public String solve (int M, int N) {
        // write code here
        String [] zd=new String[]{"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        StringBuilder ans=new StringBuilder();
        int flag=0;
        if (M<0)
        {
            M=-M;
            flag=1;
        }
        while (M!=0)
        {
            int a=M/N;
            int b=M%N;

                ans.insert(0,zd[b]);
            M=a;
        }
        if (flag==1)
        {
            ans.insert(0,'-');
        }
        return ans.toString();
    }
}
