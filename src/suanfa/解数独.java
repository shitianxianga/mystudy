package suanfa;

/*
题目：
    编写一个程序，通过已填充的空格来解决数独问题。
        一个数独的解法需遵循如下规则：
        数字 1-9 在每一行只能出现一次。
        数字 1-9 在每一列只能出现一次。
        数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
        空白格用 '.' 表示。
        Note:
        给定的数独序列只包含数字 1-9 和字符 '.' 。
        你可以假设给定的数独只有唯一解。
        给定数独永远是 9x9 形式的。
思路:
一看就是用递归回溯。分别用数组存行，列，3*3宫内数字的出现情况，用dfs递归前判断数字是否出现。
*/

import java.util.ArrayList;
import java.util.List;

public class 解数独 {
   private boolean line[][]=new boolean[9][9];
   private  boolean row[][]=new boolean[9][9];
   private boolean gare[][][]=new boolean[3][3][3];
   private boolean valid=false;
   private List<int[]> list=new ArrayList<>();
    public void solveSudoku(char[][] board) {
        for (int i=0;i<9;i++)
        {
            for (int j=0;j<9;j++)
            {
                if (board[i][j]==',')
                {
                    list.add(new int[]{i,j});
                }
                int digst=board[i][j]-'0'-1;
                line[i][digst]=true;
                 row[j][digst]=true;
                 gare[i/3][j/3][digst]=true;
            }
        }
    }
    public void dfs(char[][] board,int pos)
    {
        if (pos==list.size())
        {
            valid=true;
            return;
        }
        int[] arr=list.get(pos);
        int i=arr[0];
        int j=arr[1];
        for (int disght=0;disght<9&&!valid;disght++)
        {
            if (!line[i][disght]&&!row[j][disght]&&!gare[i/3][j/3][disght])
            {
                line[i][disght]=true;
                row[j][disght]=true;
                gare[i/3][j/3][disght]=true;
                board[i][j]=(char) (disght + '0' + 1);
                dfs(board,pos+1);
                line[i][disght]=false;
                row[j][disght]=false;
                gare[i/3][j/3][disght]=false;
            }
        }
    }
}
