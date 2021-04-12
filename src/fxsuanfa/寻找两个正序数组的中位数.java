package fxsuanfa;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/23 19:00
 * @updateDate 2021/3/23 19:00
 **/
public class 寻找两个正序数组的中位数 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        List<Integer> list=new ArrayList<>();
        int sum=n1+n2;
        int target=sum/2;
        int left=0;
        int right=0;

        while (left<nums1.length||right<nums2.length)
        {
           if (left<nums1.length&&right<nums2.length)
           {
               if (nums1[left]<nums2[right])
               {
                   list.add(nums1[left]);
               }
               else
               {
                   list.add(nums2[right]);
               }
           }
           if (left>=nums1.length&&right<nums2.length)
           {
               list.add(nums2[right]);
           }
           if (right>=nums2.length&&left<nums1.length)
           {
               list.add(nums1[left]);
           }
        }
        if (sum%2==0)
        {
          return   ( (double)list.get(target-1)+(double)list.get(target))/2;
        }
        else
        {
            return list.get(target);
        }
    }
}
