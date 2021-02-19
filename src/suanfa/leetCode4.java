package suanfa;

import java.util.Arrays;

public class leetCode4 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for (int i=m;i<=n;i++)
        {
            nums1[i]=nums2[j];
            j++;
        }
        Arrays.sort(nums1);

    }
}
