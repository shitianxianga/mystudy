package suanfa;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/1/5 10:05
 * @updateDate 2021/1/5 10:05
 **/
public class 较大分组的位置 {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> lists=new ArrayList<>();
        int a=0;
        int b=0;
        int count=0;
        for (int i=1;i<s.length();i++)
        {
            if (s.charAt(i)==s.charAt(i-1))
            {
                b=i;
                count++;
                continue;
            }
            if (count>=3)
                {
                    List<Integer> list=new ArrayList();
                    list.add(a);
                    list.add(b);
                    lists.add(list);
                }
            a=i;
            b=i;
            count=0;


        }
        return lists;

    }
}
