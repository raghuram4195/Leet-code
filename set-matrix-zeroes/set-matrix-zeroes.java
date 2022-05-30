class Solution {
    public void setZeroes(int[][] matrix) {
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    if(row[i]!=2)
                    {
                        row[i]=2;
                        // for(int j2=0;j2<matrix.length;j2++)
                        // {
                        //     matrix[i][j2]=0;
                        // }
                    }
                    if(col[j]!=2)
                    {
                        col[j]=2; 
                        // for(int j2=0;j2<matrix[0].length;j2++)
                        // {
                        //     matrix[j2][j]=0;
                        // }
                    }
                    
                                       
                }
            }
        }
        for(int i=0;i<row.length;i++)
        {
            if(row[i]==2)
            {
                for(int j=0;j<matrix[0].length;j++)
                {
                    matrix[i][j]=0;
                }
            }
        }
        for(int i=0;i<matrix[0].length;i++)
        {
            if(col[i]==2)
            {
                for(int j=0;j<matrix.length;j++)
                {
                    matrix[j][i]=0;
                }
            }
        }
    }
}