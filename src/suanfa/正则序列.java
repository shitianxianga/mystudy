package suanfa;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/26 16:53
 * @updateDate 2021/3/26 16:53
 **/
public class 正则序列 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] nums=new int[n];
        for (int i=0;i<n;i++)
        {
            nums[i]=scanner.nextInt();
        }
        Arrays.sort(nums);
        int sum=0;
        for (int i=0;i<n;i++)
            {
            sum+=Math.abs(nums[i]-i-1);
            }

        System.out.println(sum);
    }
}
