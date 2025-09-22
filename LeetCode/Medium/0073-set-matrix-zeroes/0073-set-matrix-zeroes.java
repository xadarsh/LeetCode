class Solution {
    public void setZeroes(int[][] matrix) {
        int colLen=matrix[0].length;
        int rowLen=matrix.length;
        //int[] colArray=new int[colLen];
        //int[] rowArray=new int[rowLen];

        //boolean isRow=false;
        boolean isCol=false;
        
        for(int i=0;i<rowLen;i++)
        {
            if(matrix[i][0]==0)
                isCol=true;
            for(int j=1;j<colLen;j++)
            {
                
                if(matrix[i][j]==0)
                {
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                    //isRow=true;
                }
            }
        }
        for(int i=rowLen-1;i>=0;i--)
        {
            for(int j=colLen-1;j>=1;j--)
            {
                if(matrix[0][j]==0 || matrix[i][0]==0)
                    matrix[i][j]=0;
            }
            if(isCol)
                matrix[i][0]=0;
        }
    }
}