package suanfa;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/12/15 9:30
 * @updateDate 2020/12/15 9:30
 **/
public class 单调递增的数字 {
    public int monotoneIncreasingDigits(int N) {
        if(N<10)
        {
            return N;
        }
        if (N==10)
        {
            return 9;
        }
        int num=N;
        List<Integer> list =new ArrayList();
        while (N>0)
        {
            list.add(N%10);
            N=N/10;
        }
        boolean flag=true;
        for (int i=0;i<list.size();i++)
        {
            if (!list.get(i).equals(list.get(i+1)))
            {
                flag=false;
            }
        }
        if (false)
        {
            return N;
        }
        for (int i=list.size()-1;i>=0;i--)
        {
            if (list.get(i)<list.get(i-1))
            {
                continue;
            }
            if (list.get(i)!=1)
            {
                list.set(i,list.get(i)-1);
                for (int j=i-1;j>=0;j--)
                {
                    list.set(j,9);
                }
                break;
            }
            if (list.get(i)==1)
            {
                for (int j=list.size()-1;j>=0;j--)
                {
                    list.set(j,9);
                }
                list.remove(list.size()-1);
                break;
            }
        }
        int res=0;
        int temp=1;
        for (int i=0;i<list.size();i++)
        {
            res=res+list.get(i)*temp;
            temp=temp*10;
        }
        return res;
    }
}
