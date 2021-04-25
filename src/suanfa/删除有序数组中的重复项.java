package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/19 10:43
 * @updateDate 2021/4/19 10:43
 **/
public class 删除有序数组中的重复项 {
    public int removeDuplicates(int[] nums) {
        int next=1;
        if (nums.length==0||nums.length==1)
        {
            return nums.length;
        }
        int index=0;
        while (next<=nums.length-1)
        {
            if (nums[next]!=nums[index])
            {
                int temp=nums[next];
                nums[next]=nums[index];
                nums[index++]=temp;
            }
            next++;
        }
        return index+1;
    }
}
