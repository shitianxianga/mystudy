package suanfa;

import java.util.Arrays;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/1/20 9:21
 * @updateDate 2021/1/20 9:21
 **/
public class 三个数的最大乘积 {
    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);
        return Math.max(nums[0]*nums[1]*nums[nums.length-1],nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]);

    }
}
