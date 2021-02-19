package suanfa;

import java.util.Arrays;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/12/24 9:02
 * @updateDate 2020/12/24 9:02
 **/
public class 分发糖果 {
    public int candy(int[] ratings) {
        int [] nums=new int[ratings.length];
        int length=ratings.length;
        Arrays.fill(nums,1);
        for (int i=0;i<length;i++)
        {
            if (i==0)
            {
                if (ratings[i]>ratings[i+1])
                {
                    nums[i]++;
                }
            }
           else if (i==length-1)
            {
                if (ratings[i]>ratings[i-1])
                {
                    nums[i]=nums[i-1]+1;
                }
                while (i>0&&nums[i-1]>nums[i])
                {
                    if (nums[i-1]>nums[i])
                    {
                        nums[i-1]=nums[i]+1;
                    }
                    i--;
                }
            }
           else
            {
                if (ratings[i]>ratings[i-1])
                {
                    nums[i]=nums[i-1]+1;
                    continue;
                }
                if (ratings[i]>ratings[i+1])
                {
                    nums[i]++;
                    while (i>0&&nums[i-1]>nums[i])
                    {
                        if (nums[i-1]>nums[i])
                        {
                            nums[i-1]=nums[i]+1;
                        }
                        i--;
                    }
                }
            }
        }
        return  Arrays.stream(nums).sum();
    }
}
