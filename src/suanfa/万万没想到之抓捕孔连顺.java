package suanfa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/1/13 11:22
 * @updateDate 2021/1/13 11:22
 **/
public class 万万没想到之抓捕孔连顺 {
    public static void main(String[] args) {

    }
    public  int[] get(int[] nums)
    {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++)
        {
            if (map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
                continue;
            }
            map.put(nums[i],1);
        }
        for (int i=1;i<10;i++)
        {
            if (map.containsKey(i))
            {

            }
        }
        return null;
    }

}