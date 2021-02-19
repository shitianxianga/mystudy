package suanfa;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/2/3 9:35
 * @updateDate 2021/2/3 9:35
 **/
public class 滑动窗口中位数 {
    public static double[] medianSlidingWindow(int[] nums, int k) {

        int left=0;
        int right=k;
        int[] temp=new int[k];
        double[] ans=new double[nums.length-k+1];
        int index=0;
        while (right<=nums.length)
        {

            System.arraycopy(nums,left,temp,0,k);
            Arrays.sort(temp);

            if (k%2==0) {
                DecimalFormat df=new DecimalFormat("0.00000");
                System.out.println((double)temp[(k-1)/2]);
                Double result=Double.valueOf( df.format((double)temp[(k-1)/2]+temp[(k-1)/2+1]/2));
                System.out.println(result);
                ans[index] =result;

            }else {
                ans[index] = temp[k/ 2-1];
            }
            index++;
            left++;
            right++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{2147483647,2147483647};
        medianSlidingWindow(nums,2);

        double a=2147483647.0;
        DecimalFormat df=new DecimalFormat("0.00000");
        System.out.println(df.format((a+a)/2));
    }
}
