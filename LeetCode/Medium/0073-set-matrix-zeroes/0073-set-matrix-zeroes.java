class Solution {
    public void setZeroes(int[][] matrix) {
        int colLen=matrix[0].length;
        int rowLen=matrix.length;
        //int[] colArray=new int[colLen];
        //int[] rowArray=new int[rowLen];

        boolean isRow=false;
        boolean isCol=false;
        
        //checking the rows
        for(int i=0;i<rowLen;i++)
        {
            if(matrix[i][0]==0)
                isRow=true;
        }

        //check the column
        for(int j=0;j<colLen;j++)
        {
            if(matrix[0][j]==0)
                isCol=true;
        }

        //checking other rows and columns
        for(int i=1;i<rowLen;i++)
        {
            for(int j=1;j<colLen;j++)
            {
                
                if(matrix[i][j]==0)
                {
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }

        //setting other rows and columns 0
        for(int i=rowLen-1;i>=0;i--)
        {
            for(int j=colLen-1;j>=1;j--)
            {
                if(matrix[0][j]==0 || matrix[i][0]==0)
                    matrix[i][j]=0;
            }
        }

        //setting rows to 0 based on condition
        if(isRow)
        {
            for(int j=0;j<colLen;j++)
                matrix[0][j]=0;
        }

        //setting columns to 0 based on condition
        if(isCol)
        {
            for(int i=0;i<rowLen;i++)
                matrix[i][0]=0;
        }
    }
}