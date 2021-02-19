package suanfa;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/11/5 14:51
 * @updateDate 2020/11/5 14:51
 **/
public class 单词接龙 {

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {

        List list=new ArrayList();
        HashSet<String> set=new HashSet<>(wordList);
        set.remove(beginWord);
        HashSet<String> visit=new HashSet<>();
        int step=1;
        Queue<String> queue=new LinkedBlockingQueue<>();
        queue.offer(beginWord);
        visit.add(beginWord);
        while (!queue.isEmpty())
        {
            int size=queue.size();
            for (int i=0;i<size;i++)
            {
                String word=queue.poll();
                char[] arry=word.toCharArray();
                for (int j=0;j<arry.length;j++)
                {
                    char originChar=arry[j];
                    for (char k='a';k<'z';k++)
                    {
                        if (originChar==k)
                        {
                            continue;
                        }
                        arry[i]=k;
                        if (set.contains(arry.toString()))
                        {
                            if (arry.toString().equals(endWord))
                            {
                                return step+1;
                            }
                            if (!visit.contains(arry.toString()))
                            {
                                queue.offer(arry.toString());
                                visit.add(arry.toString());
                            }
                        }
                    }
                    arry[j]=originChar;
                }
            }
            step++;
        }
        return 0;
    }
}
