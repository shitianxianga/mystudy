package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/9 9:00
 * @updateDate 2021/3/9 9:00
 **/
public class 删除字符串中的所有相邻重复项 {
    public String removeDuplicates(String S) {
        StringBuilder ans=new StringBuilder();
        ans.append(S.charAt(0));
        for (int i=1;i<S.length();i++)
        {
            if (ans.length()==0||S.charAt(i)!=ans.charAt(ans.length()-1))
            {
                ans.append(S.charAt(i));
                continue;
            }
            if (ans.length()!=0) {
                ans.deleteCharAt(ans.length() - 1);
            }
        }
        return ans.toString();
    }
}
