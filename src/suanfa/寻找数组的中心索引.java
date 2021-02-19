package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/1/28 9:31
 * @updateDate 2021/1/28 9:31
 **/
public class 寻找数组的中心索引 {
    public int pivotIndex(int[] nums) {

        for (int i=1;i<nums.length-1;i++)
        {
            int left=0;
            int right=0;
            int l=i-1;
            int r=i+1;
            while (l>=0)
            {
                left+=nums[l];
            }
            while (r<nums.length)
            {
                right+=nums[r];
            }
            if (left!=0&&left==right)
            {
                return i;
            }
        }
        return -1;
    }
}
