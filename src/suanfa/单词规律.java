package suanfa;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/12/16 9:56
 * @updateDate 2020/12/16 9:56
 **/
public class 单词规律 {
    public boolean wordPattern(String pattern, String s) {
        char[] chars=pattern.toCharArray();
        String[] strings=s.split(" ");
        if (chars.length!=strings.length)
        {
            return false;
        }
        Map<String,String> map=new HashMap<>();
        Map<String,String> map1=new HashMap<>();
        for (int i=0;i<chars.length;i++)
        {
            if (map.containsKey(""+chars[i]))
            {
                if (!map.get(""+chars[i]).equals(strings[i]))
                {
                    return  false;
                }
            }
            else
            {
                map.put(""+chars[i],strings[i]);
            }

            if (map1.containsKey(strings[i]))
            {
                if (!map1.get(strings[i]).equals(""+chars[i]))
                {
                    return  false;
                }
            }
            else
            {
                map1.put(strings[i],""+chars[i]);
            }
        }
        return true;
    }
}
