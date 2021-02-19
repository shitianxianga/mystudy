package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/1/18 9:26
 * @updateDate 2021/1/18 9:26
 **/
public class 缀点成线 {
    public boolean checkStraightLine(int[][] coordinates) {

        int [] nums1=coordinates[0];
        int [] nums2=coordinates[1];
        if(nums1[0]==nums2[0])
        {
            for (int i=2;i<coordinates.length;i++)
            {
                if (coordinates[i][0]!=nums1[0])
                {
                    return false;
                }
            }
        }
        if(nums1[1]==nums2[1])
        {
            for (int i=2;i<coordinates.length;i++)
            {
                if (coordinates[i][1]!=nums1[1])
                {
                    return false;
                }
            }
        }
        double k=(double)(nums1[1]-nums2[1])/(double)(nums1[0]-nums2[0]);
        double b=(double)nums1[1]-k*(double)nums1[0];

        for (int i=2;i<coordinates.length;i++)
        {
            if (coordinates[i][1]!=coordinates[i][0]*k+b)
            {
                return false;
            }
        }
        return true;
    }
}
