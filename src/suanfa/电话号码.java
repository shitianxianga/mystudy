package suanfa;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class 电话号码 {
   static   HashMap<String,char[]> map=new HashMap<>();
   static   List<String> list=new ArrayList<>();
    public static List<String> letterCombinations(String digits) {
        map.put("2",new char[]{'a','b','c'});
        map.put("3",new char[]{'d','e','f'});
        map.put("4",new char[]{'g','h','i'});
        map.put("5",new char[]{'j','k','l'});
        map.put("6",new char[]{'m','n','o'});
        map.put("7",new char[]{'p','q','r','s'});
        map.put("8",new char[]{'t','u','v'});
        map.put("9",new char[]{'w','x','y','z'});
        if (digits.equals(""))
        {
            return list;
        }
        hs(digits,0,"");
        return list;
    }
    public static   void hs(String digits,int pos,String ans)
    {
        if (pos==digits.length())
        {
            list.add(new String(ans));
            return;
        }
        char[] chars=map.get(""+digits.charAt(pos));
        for (int i=0;i<chars.length;i++)
        {
            String temp=ans;
            ans+=chars[i];
            hs(digits,pos+1,ans);
            ans=temp;
        }
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("234").toString());
    }
}
