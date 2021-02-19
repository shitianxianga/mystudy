package suanfa;

import java.util.ArrayList;
import java.util.List;

public class 单词搜索 {
    List<String> strings=new ArrayList<>();
    int[][]  dir=new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
    boolean[][] maked;
    String word;
    int n;
    int m;
    public boolean exist(char[][] board, String word) {
        this.word=word;
        n=board.length;
        m=board[0].length;
        maked=new boolean[n][m];
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
               if (hs(board,i,j,0))
                   return true;
            }
        }
        return false;
    }
    public  boolean  hs(char[][] board,int pos,int ous,int location)
    {
        if (location==word.length()-1)
        {
            return board[pos][ous]==word.charAt(location);
        }
        if (board[pos][ous]!=word.charAt(location))
        {
            return  false;
        }
        maked[pos][ous]=true;
        for (int i=0;i<4;i++)
        {
            int newX=pos+dir[i][0];
            int newY=pos+dir[i][1];
            if (inArea(newX,newY)&&!maked[newX][newY])
            {
                hs(board,newX,newY,location+1);
            }
        }
        maked[pos][ous]=false;
        return false;
    }
    public boolean inArea(int x, int y) {
        return x >= 0 && x < m && y >= 0 && y < n;
    }
}
