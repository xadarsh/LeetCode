class Solution {
    public void setZeroes(int[][] matrix) {
        int colLen=matrix[0].length;
        int[] colArray=new int[colLen];
        int rowLen=matrix.length;
        int[] rowArray=new int[rowLen];
        
        for(int i=0;i<rowLen;i++)
        {
            for(int j=0;j<colLen;j++)
            {
                if(matrix[i][j]==0)
                {
                    colArray[j]=1;
                    rowArray[i]=1;
                }
            }
        }
        for(int i=0;i<rowLen;i++)
        {
            for(int j=0;j<colLen;j++)
            {
                if(rowArray[i]!=0)
                {
                    matrix[i][j]=0;
                }
                else if(colArray[j]!=0)
                    matrix[i][j]=0;
            }
        }
    }
}