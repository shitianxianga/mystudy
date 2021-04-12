package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/6 15:01
 * @updateDate 2021/4/6 15:01
 **/
public class 合并两个有序数组 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i=0;i<n;i++)
        {
            int j=m-1;
            for (;j>=0;j--)
            {
                if (nums2[i]<nums1[j])
                {
                    nums1[j+1]=nums1[j];
                }
            }
            nums1[j]=nums2[i];
            m++;
        }
    }
}
