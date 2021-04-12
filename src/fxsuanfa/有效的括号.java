package fxsuanfa;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.logging.Handler;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/24 15:33
 * @updateDate 2021/3/24 15:33
 **/
public class 有效的括号 {
    public boolean isValid(String s) {
        Map<Character,Character> map=new HashMap<>();
        map.put('{','}');
        map.put('(',')');
        map.put('[',']');
        Deque<Character> deque=new LinkedList<>();
        for (int i=0;i<s.length();i++)
        {
            if (!deque.isEmpty()&&map.containsKey(deque.peek())&&s.charAt(i)==map.get(deque.peek()))
            {
                deque.poll();
                continue;
            }
            deque.push(s.charAt(i));
        }
        return deque.isEmpty();
    }

    public static void main(String[] args) {
        Character c=new Character('c');
        System.out.println('c'==c);
    }
}
