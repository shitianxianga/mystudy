package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/11/30 17:11
 * @updateDate 2020/11/30 17:11
 **/
public class 最大重复子字符串 {
    public int maxRepeating(String sequence, String word) {

        int ans=0;
        if (sequence.contains(word))
        {
            while (sequence.contains(word))
            {
                word+=word;
                ans++;
            }

        }
        return ans;
    }
}
