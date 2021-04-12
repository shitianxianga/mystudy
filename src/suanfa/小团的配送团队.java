package suanfa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/2/24 15:30
 * @updateDate 2021/2/24 15:30
 **/
public class 小团的配送团队 {
    static List<List<Integer>> list=new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        unionSet set=new unionSet(x);

        for (int i=0;i<x;i++)
        {
            List<Integer> l=new ArrayList<>();
            l.add(i);
            list.add(l);
        }
        int[][] nums=new int[y][2];
        for (int i=0;i<y;i++)
        {
           set.union(scanner.nextInt(),scanner.nextInt());
        }
        System.out.println(set.count);
        for (int i=0;i<x;i++)
        {

        }


    }
    static  class unionSet{
        public int[] parent;
        public int count;

        public unionSet(int count) {
            this.count = count;
            this.parent=new int[count];
            for (int i=0;i<count;i++)
            {
                parent[i]=i;
            }
        }
        public int find(int x)
        {
            if (parent[x]!=x)
            {
                return find(parent[x]);
            }

            return parent[x];
        }
        public void union(int x,int y)
        {
            if (x==y)
            {
                return;
            }
            int X=find(x);
            int Y=find(y);
            if (X!=Y)
            {
                 if (X<Y)
                 {
                 parent[Y]=X;
                 list.get(Y).add(x);
                 }
                 else
                 {
                     parent[X]=Y;
                     list.get(X).add(y);
                 }
                 count--;
            }
        }
    }
}
