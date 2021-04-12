package suanfa;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/11 10:58
 * @updateDate 2021/3/11 10:58
 **/
public class 基本计算器2 {
    Map<Character,Integer> map=new HashMap<>();
    public int calculate(String s) {
        return toBL(s);
    }
    public Integer toBL(String s)
    {
        map.put('+',1);
        map.put('-',1);
        map.put('/',2);
        map.put('*',2);
        Deque<Character> deque=new LinkedList<>();
        int i=0;
        Deque<Integer> nums=new LinkedList<>();

        while (i<s.length())
        {
            if (s.charAt('i')==' ')
            {
                i++;
            }
            else if (s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='/'||s.charAt(i)=='*')
            {
                if (deque.isEmpty())
                {
                    deque.add(s.charAt(i));
                    i++;
                    continue;
                }
                 if (map.get(s.charAt(i))>map.get(deque.peek()))
                {
                    deque.add(s.charAt(i));
                    i++;
                    continue;
                }
                while (map.get(s.charAt(i))<=map.get(deque.peek()))
                {
                    char f=deque.poll();
                    Integer a=nums.poll();
                    Integer b=nums.poll();
                    Integer c=0;
                    if (f=='+')
                    {
                        c=b+a;
                    }
                    if (f == '-')
                    {
                        c=b-a;
                    }
                    if (f=='/')
                    {
                        c=b/a;
                    }
                    if (f=='*')
                    {
                        c=b*a;
                    }
                    nums.add(c);
                }
                deque.add(s.charAt(i));
                i++;
            }
            else
            {
                Integer num=0;
                while (i<s.length()&&Character.isDigit(s.charAt(i)))
                {
                    num=num*10+s.charAt(i)-'0';
                    i++;
                }
                nums.add(num);
            }
        }
        while (!deque.isEmpty())
        {
            char f=deque.poll();
            Integer a=nums.poll();
            Integer b=nums.poll();
            Integer c=0;
            if (f=='+')
            {
                c=b+a;
            }
            if (f == '-')
            {
                c=b-a;
            }
            if (f=='/')
            {
                c=b/a;
            }
            if (f=='*')
            {
                c=b*a;
            }
            nums.add(c);
        }
        return  nums.poll();
    }
}
