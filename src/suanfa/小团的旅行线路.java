package suanfa;

import java.util.*;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/2/25 9:42
 * @updateDate 2021/2/25 9:42
 **/
public class 小团的旅行线路 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        Map<String, Integer> map=new HashMap<>();

        int index=0;
        int ans=0;
        List<int[]> list=new ArrayList<>();
        for (int i=0;i<num;i++)
        {
            int x=index;
            String a=scanner.next();
            if (!map.containsKey(a))
            {
                map.put(a,index++);
            }
            else
            {
                x=map.get(a);
            }
            int y=index;
            String b=scanner.next();
            if (!map.containsKey(a))
            {
                map.put(a,index++);
            }
            else
            {
                y=map.get(b);
            }
            list.add(new int[]{x,y});
        }
        unionSet set=new unionSet(map.size());
        for (int i=0;i<list.size();i++)
        {
            int[] nums=list.get(i);
            if (!set.union(nums[0],nums[1]))
            {
                ans++;
            }
        }
        System.out.println(ans);
    }
    public static class unionSet{
        int[] p;

        public unionSet(int l) {
            this.p = new int[l];
            for (int i=0;i<l;i++)
            {
                p[i]=i;
            }
        }
        public int find(int x)
        {
            if (p[x]==x)
            {
                return p[x];
            }
            return find(p[x]);
        }
        public boolean union(int x,int y)
        {
            int X=find(x);
            int Y=find(y);
            if (X==Y)
            {
                return false;
            }
            p[Y]=x;
            return true;
        }
    }
}
