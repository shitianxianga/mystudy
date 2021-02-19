package sort;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/11/9 14:06
 * @updateDate 2020/11/9 14:06
 **/
public class binarySort {

    public int[] binarySort(int[] nums)
    {
        int length=nums.length;
        if (length<2)
        {
            return nums;
        }
        for (int i=1;i<nums.length;i++)
        {
            int left=0;
            int right=i;
            int temp=nums[i];
            if (nums[i]-nums[i-1]<0)
            {

                while (left<=right)
                {
                    int mid=(left+right)/2;
                    if (nums[mid]>temp)
                    {
                        right=mid;
                    }
                    else
                    {
                        left=mid;
                    }
                }
            }
            for (int j=i;j>left;j++)
            {
                nums[j]=nums[j-1];
            }
            nums[left]=temp;
        }
        return nums;
    }
}
