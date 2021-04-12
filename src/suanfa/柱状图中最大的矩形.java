package suanfa;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/30 13:54
 * @updateDate 2021/3/30 13:54
 **/
public class 柱状图中最大的矩形 {
    public int largestRectangleArea(int[] heights) {
        if (heights.length==0)
        {
            return 0;
        }
        if (heights.length==1)
        {
            return heights[0];
        }
        int[] newHeight=new int[heights.length+2];
        newHeight[0]=0;
        for (int i=1;i<newHeight.length-1;i++)
        {
            newHeight[i]=heights[i-1];
        }
        newHeight[newHeight.length-1]=0;
        Deque<Integer> deque=new LinkedList<>();
        deque.addLast(0);
        int ans=0;
        for (int i=1;i<newHeight.length;i++)
        {
            while (newHeight[i]<=newHeight[deque.peekLast()])
            {
                int w=i-deque.peekFirst()-1;
                ans=Math.max(w*newHeight[deque.pollLast()],ans);
            }
            deque.addLast(i);
        }
        return  ans;
    }
}
