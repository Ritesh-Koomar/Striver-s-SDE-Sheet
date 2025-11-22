class Solution {
    public void setZeroes(int[][] matrix) {
        boolean fRow = false;
        boolean fColn = false;
        for(int i = 0;i<matrix.length;i++)
        {
            for(int j = 0;j<matrix[i].length;j++)
            {
                if(matrix[i][j] == 0)
                {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                    if(i == 0) fRow = true;
                    if(j == 0) fColn = true;
                }
            }
        }
        for(int i = 1;i<matrix.length;i++)
        {
            for(int j = 1;j<matrix[i].length;j++)
            {
                if(matrix[i][0] == 0 || matrix[0][j] == 0)
                {
                    matrix[i][j] = 0;
                }
            }
        }
        if(fRow)
        {
            for(int i = 0;i<matrix[0].length;i++)
            {
                matrix[0][i] = 0;
            }
        }
        if(fColn)
        {
            for(int i = 0;i<matrix.length;i++)
            {
                matrix[i][0] = 0;
            }
        }
        
    }
}
