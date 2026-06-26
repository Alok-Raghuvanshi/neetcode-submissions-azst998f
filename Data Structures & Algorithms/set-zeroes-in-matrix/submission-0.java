class Solution {
    public void setZeroes(int[][] matrix) {
       int r=matrix.length;
       int c=matrix[0].length;
       boolean fr=false;
       boolean fc=false;
       //checking 0 in first row
       for(int i=0;i<c;i++)
       {
        if(matrix[0][i]==0)
        {
            fr=true;
            break;
        }
       }
       //checking 0 in fiirst column
       for(int i=0;i<r;i++)
       {
        if(matrix[i][0]==0)
        {
            fc=true;
            break;
        }
       }
       //checking 0 in inner matrix and marking first row and column
       for(int i=1;i<r;i++)
       {
        for(int j=1;j<c;j++)
        {
            if(matrix[i][j]==0)
            {
                matrix[i][0]=0;
                matrix[0][j]=0;
            }
        }
       }
        for(int i=c-1;i>=1;i--)
        {
            if(matrix[0][i]==0){
          for(int j=1;j<r;j++)
          {
             matrix[j][i]=0; 
          }
            }
        }
        for(int i=1;i<r;i++)
        {
            if(matrix[i][0]==0){
            for(int j=0;j<c;j++)
            {
             matrix[i][j]=0;
            }
        }
        }
        if(fr==true)
        {
            for(int j=0;j<c;j++)
            matrix[0][j]=0;
        }
        if(fc==true)
        {
            for(int j=0;j<r;j++)
            matrix[j][0]=0;
        }
       } 
    }
