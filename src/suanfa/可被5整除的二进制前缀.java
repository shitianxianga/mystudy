package suanfa;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/1/14 8:53
 * @updateDate 2021/1/14 8:53
 *
 **/
public class 可被5整除的二进制前缀 {
    public List<Boolean> prefixesDivBy5(int[] A) {
        int a=0;
        List<Boolean>list=new ArrayList<>();
        for (int i=0;i<A.length;i++)
        {
            a=a>>1+A[i];
            if (a%5==0)
            {
                list.add(true);
                continue;
            }
            list.add(false);
        }
        return list;

    }
}
