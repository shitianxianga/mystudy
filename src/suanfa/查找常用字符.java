package suanfa;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/10/14 10:07
 * @updateDate 2020/10/14 10:07
 **/
public class 查找常用字符 {
    public static List<String> commonChars(String[] A) {
        List ans=new ArrayList();
        if (A.length==1)
        {
            for (int i=0;i<A[0].length();i++)
            {
                ans.add(""+A[0].charAt(i));
            }
            return  ans;
        }

            for (int j=0;j<A[0].length();j++)
            {
                for(int i=1;i<A.length;i++)
                {
                    if (A[i].contains(""+A[0].charAt(j)))
                    {
                        String temp=A[0].charAt(j)+"";
                        A[i]=A[i].replaceFirst(temp,"");
                        System.out.println(A[i]);
                        if (i==A.length-1)
                        {
                            ans.add(A[0].charAt(j));
                        }
                    }
                    else
                    {
                        break;
                    }
                }

            }

    return ans;
    }

    public static void main(String[] args) {
        String[] A= new String[]{"cool","lock","cook"};
        commonChars(A);
        System.out.println("123".replaceFirst("1",""));
    }
}
