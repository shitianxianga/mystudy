package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/23 16:15
 * @updateDate 2021/3/23 16:15
 **/
public class 最后一个单词的长度 {
    public int lengthOfLastWord(String s) {
        int start=0;
        int end=0;
        for (int i=s.length()-1;i>=0;i--)
        {
            if (start==0&&s.charAt(i)!=' ')
            {
                start=i;
            }
            if (start!=0&&s.charAt(i)==' ')
            {
                end=i;
                break;
            }
        }
        return start-end;
    }
}
