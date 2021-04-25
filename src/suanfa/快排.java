package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/21 17:06
 * @updateDate 2021/4/21 17:06
 **/
public class 快排 {
    public  void  qucksort(int left,int right,int [] nums)
    {
        int l=left;
        int r=right;
        int target=nums[left];
        while (l<r)
        {
            while (l<r&&nums[l]<=target)
            {
                l++;
            }
            while (l<r&&nums[r]>target)
            {
                r--;
            }
            if (l<r)
            {
                int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
            }
        }
        nums[left]=nums[l];
        nums[l]=target;
        qucksort(left,l-1,nums);
        qucksort(l+1,right,nums);
    }

}
