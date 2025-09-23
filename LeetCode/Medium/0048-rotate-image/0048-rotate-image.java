class Solution {
    public void rotate(int[][] matrix) {
        int row=matrix.length;
        int col=row;
        int temp=-1;
        
        //Transpose
        for(int i=0;i<row;i++)
        {
            for(int j=i+1;j<col;j++)
            {
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        //Swap the columns
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col/2;j++)
            {
                temp=matrix[i][j];
                matrix[i][j]=matrix[i][col-1-j];
                matrix[i][col-1-j]=temp;
            }
        }
        
    }
}