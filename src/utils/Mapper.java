package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/7 11:59
 * @updateDate 2021/4/7 11:59
 **/
public class Mapper<T> {
    public    List<T> LIST=new ArrayList<>();
    public  void  insert(List<T> list)
    {
        for (T t:list)
        {
           LIST.add(t);
        }
    }

    public static void main(String[] args) {
         ConcurrentUtil<Integer> concurrentUtil=new ConcurrentUtil<>();
         Mapper<Integer> mapper=new Mapper<>();
         List<Integer> list=new ArrayList<>();
         for (int i=0;i<2000;i++)
         {
             list.add(i);
         }
         concurrentUtil.insert(list,mapper::insert);
         Collections.sort(mapper.LIST);
    }
}
