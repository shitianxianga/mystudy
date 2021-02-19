package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/11/20 13:50
 * @updateDate 2020/11/20 13:50
 **/
public class 一次编辑 {
    public boolean oneEditAway(String first, String second) {
        if (Math.abs(first.length()-second.length())>1)
        {
            return false;
        }
        char[]firstArrys=first.toCharArray();
        char[] secondArrys=second.toCharArray();
        StringBuilder secondBuilder=new StringBuilder();
        if (first.length()==second.length())
        {
            for (int i=0;i<firstArrys.length;i++) {
                if (firstArrys[i] != secondArrys[i]) {
                    firstArrys[i] = secondArrys[i];
                    break;
                }
            }
            first=new String(firstArrys);
            second=new String(secondArrys);
            return first.equals(second);
        }
        else
        {
            if (first.length()<second.length())
            {
                String temp=first;
                first=second;
                second=temp;
            }
            secondBuilder=new StringBuilder(second);
            for (int i=0;i<first.length();i++)
            {
                if (i>second.length()-1)
                {
                    secondBuilder.append(first.charAt(i));
                   break;
                }
                if (first.charAt(i)!=second.charAt(i))
                {
                    secondBuilder.insert(i-1,first.charAt(i));
                    break;
                }
            }
            second=secondBuilder.toString();
            return first.equals(second);

        }

    }
}
