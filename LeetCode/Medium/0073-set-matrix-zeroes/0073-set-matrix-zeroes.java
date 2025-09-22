class Solution {
    public void setZeroes(int[][] matrix) {
        
        int row=matrix.length;
        int col=matrix[0].length;
        boolean isRow=false;
        boolean isCol=false;
        
        for(int r=0;r<row;r++)
        {
            for(int c=0;c<col;c++)
            {
                if(matrix[r][c]==0)
                {
                    matrix[r][0]=0;
                    matrix[0][c]=0;
                    if (r==0) isRow=true;
                    if(c==0) isCol=true;
                }
            }
        }
        for(int r=1;r<row;r++)
        {
            for(int c=1;c<col;c++)
            {
                if(matrix[r][0]==0 || matrix[0][c]==0)
                    matrix[r][c]=0;
            }
        }
        if(isCol)
        {
            for(int r=0;r<row;r++)
                matrix[r][0]=0;
        }
            
        if(isRow)
        {
            for(int c=0;c<col;c++)
                matrix[0][c]=0;
        }
        
        
    }
}