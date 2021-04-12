package utils;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/7 11:27
 * @updateDate 2021/4/7 11:27
 **/
public class ConcurrentUtil<T> {
    private static  Integer SIZE=1000;
    public  void  insert(List<T> list, Consumer<List<T>> consumer)
    {
        List<List<T>> lists=new ArrayList<>();
        for (int i=0;i<list.size();i+=SIZE)
        {
            int j=Math.min(i+SIZE,list.size());
            List<T> list1=list.subList(i,j);
            lists.add(list1);
        }
        lists.stream().parallel().forEach(consumer);
    }
}
