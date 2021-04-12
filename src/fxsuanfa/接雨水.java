package fxsuanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/26 11:02
 * @updateDate 2021/3/26 11:02
 **/
public class 接雨水 {
    public int trap(int[] height) {

        int[] ldp=new int[height.length];
        ldp[0]=height[0];

        int [] rdp=new int[height.length];
        rdp[height.length-1]=height[height.length-1];
        int ans=0;
        for (int i=1;i<height.length;i++)
        {
            ldp[i]=Math.max(ldp[i-1],height[i]);
        }
        for (int i=height.length-1;i>0;i--)
        {
            rdp[i]=Math.max(rdp[i+1],height[i]);
        }
        for (int i=0;i<height.length;i++)
        {
            int min=Math.min(ldp[i],rdp[i]);
            ans+=min-height[i];
        }
        return ans;
    }
}
