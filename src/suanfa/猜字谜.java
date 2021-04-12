package suanfa;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/2/26 9:24
 * @updateDate 2021/2/26 9:24
 **/
public class 猜字谜 {

    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        int[][] dict=new int[puzzles.length][26];
        int[][]dictHead=new int[puzzles.length][26];
        for (int i=0;i<puzzles.length;i++)
        {
            for (int j=0;j<puzzles[i].length();j++)
            {
                dict[i][puzzles[i].charAt(j)-'a']++;
            }
            dictHead[i][puzzles[i].charAt(0)-'a']++;
        }
        List<Integer> list=new ArrayList<>();
        for (int i=0;i<puzzles.length;i++)
        {
            int num=0;
            for (int j=0;j<words.length;j++)
            {
                boolean flag=true;
                for (int k=0;k<words[i].length();k++)
                {
                    if (dict[j][words[i].charAt(k)-'a']==0)
                    {
                        flag=false;
                    }
                    dictHead[i][words[i].charAt(k)-'a']--;
                }
                if (dictHead[i][puzzles[i].charAt(0)-'a']==1)
                {
                    flag=false;
                }
                if (flag)
                {
                    num++;
                }
            }
            list.add(num);
        }
        return list;
    }
}
