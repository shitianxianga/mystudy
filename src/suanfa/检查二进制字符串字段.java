package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/16 10:02
 * @updateDate 2021/3/16 10:02
 **/
public class 检查二进制字符串字段 {
    public boolean checkOnesSegment(String s) {

        int num=0;
        for (int i=0;i<s.length();i++)
        {
           if (s.charAt(i)=='1')
           {
               num++;
               while (s.charAt(i)=='1')
               {
                   i++;
               }
           }
        }
        return num==1;
    }
}
