package suanfa;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.*;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/2/25 10:09
 * @updateDate 2021/2/25 10:09
 **/
public class 小团的车辆调度 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        List<int[]> list=new ArrayList<>();
        List<int[]> list1=new ArrayList<>();
        for (int i=0;i<n;i++)
        {
            int[] nums=new int[]{scanner.nextInt(),scanner.nextInt()};
            list.add(nums);
            list1.add(nums);
        }
        list.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0]==o2[0])
                {
                    return o2[1]-o1[1];
                }
                return o2[0]-o1[0];
            }
        });
        list1.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1]==o2[1])
                {
                    return o2[0]-o1[0];
                }
                return o2[1]-o1[1];
            }
        });
        int ans1=0;
        for (int i=0;i<a;i++)
        {
            ans1+=list.get(i)[0];
            list.remove(0);
        }
        System.out.println(ans1);
        list.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1]==o2[1])
                {
                    return o2[0]-o1[0];
                }
                return o2[1]-o1[1];
            }
        });
        for (int i=0;i<b;i++)
        {
            ans1+=list.get(i)[1];
        }

        int ans2=0;
        for (int i=0;i<b;i++)
        {
            ans2+=list1.get(i)[1];
            list1.remove(0);
        }
        list1.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0]==o2[0])
                {
                    return o2[1]-o1[1];
                }
                return o2[0]-o1[0];
            }
        });
        for (int i=0;i<a;i++)
        {
            ans2+=list1.get(i)[0];
        }
        ans1=Math.max(ans1,ans2);
        System.out.println(ans1);
    }
}
