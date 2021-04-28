package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/28 9:40
 * @updateDate 2021/4/28 9:40
 **/
public class 平方数之和 {
    public boolean judgeSquareSum(int c) {
        int num= (int) Math.sqrt(c);
        int left=0;
        int right=num;
        while (left<=right)
        {
            if (left*left+right*right==c)
            {
                return true;
            }
            else if (left*left+right*right<c)
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return false;
    }
}
