package suanfa;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/26 16:38
 * @updateDate 2021/3/26 16:38
 **/
public class 淘汰分数 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        int[] nums=new int[n];
        for (int i=0;i<n;i++)
        {
            nums[i]=scanner.nextInt();
        }
        Arrays.sort(nums);
        int m=-1;
        for (int i=0;i<n;i++)
        {
            if (i+1>=x&&i+1<=y&&n-i>=x&&n-i<=y)
            {
                m=nums[i];
                break;
            }
        }
        System.out.println(m);
    }
}
