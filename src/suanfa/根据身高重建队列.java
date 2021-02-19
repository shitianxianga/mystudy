package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/11/16 9:31
 * @updateDate 2020/11/16 9:31
 **/
public class 根据身高重建队列 {
    public int[][] reconstructQueue(int[][] people) {
        if(people==null||people.length==1)
        {
            return people;
        }
        int[][] res=new int[people.length][people[0].length];
        for (int i=0;i<people.length;i++)
        {
            for (int j=0;j<=i;j++)
            {
                for (int k=0;k<people.length;k++)
                {
                    if (people[k][1]==j)
                    {
                        if (res[i][1]>=people[k][j])
                        {
                            res[i]=people[k];
                        }
                    }
                }
            }
        }
        return res;
    }
}
