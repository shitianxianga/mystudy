package sort;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/11/9 15:12
 * @updateDate 2020/11/9 15:12
 **/
public class mergeSort {
    public  void mergeSort(int[] nums,int left,int right,int[] temp)
    {
        if (left<right) {
            int mid = (left + right) / 2;
            mergeSort(nums,left,mid,temp);
            mergeSort(nums,mid+1,right,temp);
            merge(nums,left,mid,right,temp);
        }
    }
    public void merge(int[] nums,int left,int right,int mid,int[] temp)
    {
        int i=0;
        int k=mid+1;
        int j=left;
        while (j<=mid&&k<=right)
        {
            if (nums[j]<nums[k])
            {
                temp[i++]=nums[j++];
            }
            else
            {
                temp[i++]=nums[k++];
            }
        }
        while(j <= mid){
            temp[i++] = nums[j++];
        }

        while(k <= right){
            temp[i++] = nums[k++];
        }

        for(int t=0;t<i;t++){
            nums[left+t] = temp[t];
        }
    }
}
