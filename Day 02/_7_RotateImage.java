class Solution {
    public void rotate(int[][] matrix) {
        // this is purely based on observation
        // 1. get the transpose first 
        for(int i = 0;i<matrix.length-1;i++)
        {
            for(int j = i;j<matrix[i].length;j++)
            {
                if(i!=j)
                {
                    int t = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = t;
                }
            }
        }
        // 2. therafter for each row, reverse the array
        for(int i = 0;i<matrix.length;i++)
        {
            int s = 0;
            int e = matrix[i].length-1;
            while(s<e)
            {
                int t = matrix[i][s];
                matrix[i][s] = matrix[i][e];
                matrix[i][e] = t;
                s++;
                e--;
            }
        }
    }
}
