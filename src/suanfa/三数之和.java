package suanfa;
/*
题目：
给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。

注意：答案中不可以包含重复的三元组。

 

示例：

给定数组 nums = [-1, 0, 1, 2, -1, -4]，

满足要求的三元组集合为：
[
  [-1, 0, 1],
  [-1, -1, 2]
]

思路：
暴力法：排序加三层for循环解决，但是很容易超时，去重也麻烦。
双指针：首先还是进行排序，一层for循环控制第一个元素的移动，左指针和右指针控制另外两个元素移动。
3数之和大于0时移动右指针，反正移动左指针。同时控制去重（左指针控制的元素如果和他的后一位相等，
就移动到下一位，右指针则是，前一位）。
*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 三数之和 {

        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> lists=new ArrayList<>();
            Arrays.sort(nums);
            List<Integer> list=new ArrayList<>();
            for (int i=0;i<nums.length;i++)
            {
                if (nums[i]>0) {
                    continue;
                }
                if (i>0&&nums[i]==nums[i-1])
                {
                    continue;
                }
                int L=i+1;
                int R=nums.length-1;
                while (L<R)
                {
                    int num=nums[i]+nums[L]+nums[R];
                    if (num==0)
                    {
                        lists.add(Arrays.asList(nums[i],nums[L],nums[R]));
                        while (L<R&&nums[L]==nums[L+1])
                        {
                            L++;
                        }
                        while (L<R&&nums[R]==nums[R-1])
                        {
                            R--;
                        }
                        L++;
                        R--;
                    }
                    if (num>0)
                    {
                        R--;
                    }
                    if (num<0)
                    {
                        L++;
                    }
                }

            }

            return lists;
        }



}
