package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/1/22 9:52
 * @updateDate 2021/1/22 9:52
 **/
public class 加一 {
    public int[] plusOne(int[] digits) {
        int[] nums=new int[digits.length+1];
        digits[digits.length-1]+=1;
        int n=digits.length-1;
        for (int i=n;i>=0;i++)
        {
            if (n!=0&&digits[n]>=10)
            {
                digits[n]=digits[n]-10;
                digits[n-1]+=1;
            }
        }
        if (digits[0]>=10)
        {
            nums[0]=1;
            nums[1]=digits[0]%10;
            for (int i=2;i<n+1;i++)
            {
             nums[i]=digits[i-1];
            }
            return nums;
        }
      return  digits;
    }
}
