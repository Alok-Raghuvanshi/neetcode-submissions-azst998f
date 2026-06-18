class Solution {
    public void rotate(int[][] matrix) {
      int n=matrix.length;
      int mat[][]=new int[n][n];
      for(int i=0;i<n;i++)
      {
        int j=0;
        int k=n-1;
        while(j<k)
        {
          int t=matrix[j][i];
          matrix[j][i]=matrix[k][i];
          matrix[k][i]=t;
          j++;
          k--;
        }
      }
     for(int i=0;i<n;i++)
     {
      for(int j=i+1;j<n;j++)
      {
        int t=matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=t;
      }
     }
    }
}
