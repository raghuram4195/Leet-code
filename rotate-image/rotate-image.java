class Solution {
    public void rotate(int[][] matrix) {
        int x = matrix[0].length;
        // int[][] dup = new int[x][x];
        // for(int i=0;i<x;i++)
        // {
        //     for(int j=0;j<x;j++)
        //     {
        //         dup[j][(x-i-1)] = matrix[i][j];
        //     }
        // }
        // for(int i=0;i<x;i++)
        // {
        //     for(int j=0;j<x;j++)
        //     {
        //         matrix[i][j]=dup[i][j];
        //     }
        // }
        for(int i=0;i<x;i++)
        {
            for(int j=i;j<x;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<x/2;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][x-1-j];
                matrix[i][x-1-j] = temp;
            }
        }
    }
}