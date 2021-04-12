package suanfa;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/7 13:50
 * @updateDate 2021/4/7 13:50
 **/
public class 搜索旋转排序数组II {
    public boolean search(int[] nums, int target) {

        int left=0;
        int right=nums.length;
        while (left<=right)
        {
            int mid=(left+right)/2;
            if (nums[mid]==target)
            {
                return true;
            }
            if (nums[left]<=nums[mid])
            {
                if (target>nums[left]&&target<nums[mid])
                {
                    right=mid-1;
                }
                else
                {
                    left=mid+1;
                }
            }
            else
            {
                if (target>nums[mid]&&target<nums[right])
                {
                    left=mid+1;
                }
                else
                {
                    right=mid-1;
                }
            }
        }
        int[][] ans=new int[2][2];
        Arrays.sort(ans, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        return false;
    }
}
