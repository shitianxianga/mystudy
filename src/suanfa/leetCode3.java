package suanfa;

public class leetCode3 {
    public boolean searchMatrix(int[][] matrix, int target)
    {
        if (matrix.length==0)
        {
            return false;
        }
        int h=matrix[0].length-1;
        int l=0;
        while (h>=0&&l<matrix.length)
        {
            if (target==matrix[l][h])
            {
                return true;
            }
            if (target<matrix[l][h])
            {
                h--;
            }
            else {
                l++;
            }

        }
        return false;

    }
}
