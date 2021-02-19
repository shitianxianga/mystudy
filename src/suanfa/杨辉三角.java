package suanfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/12/10 15:44
 * @updateDate 2020/12/10 15:44
 **/
public class 杨辉三角 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists=new ArrayList<>();
        if (numRows==0)
        {
            return lists;
        }
        List<Integer> list=new ArrayList<>();
        list.add(1);
        lists.add(new ArrayList<>(list));
        if (numRows==1)
        {
            return  lists;
        }
        list.add(1);

        lists.add(new ArrayList<>(list));
        if (numRows==2)
        {
            return lists;
        }
        for (int i=3;i<=numRows;i++)
        {
            List<Integer> temps=new ArrayList<>();
            for (int j=0;j<i;j++)
            {
                if (j==0||j==i-1)
                {
                    temps.add(1);
                    continue;
                }
                int temp=list.get(j-1)+list.get(j);
                temps.add(temp);

            }
            lists.add(new ArrayList<>(temps));
            list=temps;
        }
        return  lists;

    }
}
