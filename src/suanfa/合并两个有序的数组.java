package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/1/14 11:05
 * @updateDate 2021/1/14 11:05
 **/
public class 合并两个有序的数组 {
    public void merge(int A[], int m, int B[], int n) {
        if (m==0)
        {
            for (int i=0;i<n;i++)
            {
                A[i]=B[i];
            }
        }
        int j=m-1;
        for (int i=0;i<B.length;i++)
        {
            if (A[j]<B[i])
            {
                j++;
                A[j]=B[i];
                continue;
            }
            int start=find(A,B[i],j);
            tran(A,start,B[i],j);
            j++;
        }
    }
    public int find(int [] A,int target,int j)
    {
        int i=0;
        while (i<=j)
        {
            int mid=(i+j)/2;
            if (A[mid]==target)
            {
                return mid;
            }
            if (A[mid]<target)
            {
                i=mid+1;
            }
            else {
                j=mid-1;
            }
        }
        return 0;
    }
    public void tran(int [] A,int start,int target,int end)
    {
        for (int i=end;i>=start;i--)
        {
            A[i+1]=A[i];
        }
        A[start]=target;
    }
}
