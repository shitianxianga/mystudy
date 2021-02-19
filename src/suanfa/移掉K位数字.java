package suanfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/11/16 14:01
 * @updateDate 2020/11/16 14:01
 **/
public class 移掉K位数字 {
    public String removeKdigits(String num, int k) {
        if(k>=num.length())
        {
            return "0";
        }
        StringBuilder nums=new StringBuilder(num);
        for (int j=0;j<k;j++) {
            for (int i = 0; i < nums.length() - 1; i++) {
                if (Integer.parseInt("" + nums.charAt(i+1)) < Integer.parseInt("" +  nums.charAt(i))) {
                    nums.deleteCharAt(i);
                   while (nums.charAt(i)==0)
                   {
                       nums.deleteCharAt(i);
                   }
                   break;
                }
            }
        }
        if (nums.toString().equals(""))
        {
            return "0";
        }
        return nums.toString();

    }
}
