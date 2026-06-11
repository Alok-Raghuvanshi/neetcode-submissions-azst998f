class Solution {
    public void islandsAndTreasure(int[][] grid) {
      int r=grid.length;
      int c=grid[0].length;
      for(int i=0;i<r;i++)
      {
        for(int j=0;j<c;j++)
        {
            if(grid[i][j]==0)
            {
            distance(i,j,r,c,1,grid);
            }
        }
      }
    }
    void distance(int i,int j,int er,int ec,int dis,int grid[][])
    {
        if(i+1<er&&grid[i+1][j]!=-1&&grid[i+1][j]>dis)
        {
        grid[i+1][j]=dis;
        distance(i+1,j,er,ec,dis+1,grid);
        }
        if(j+1<ec&&grid[i][j+1]!=-1&&grid[i][j+1]>dis)
        {
        grid[i][j+1]=dis;
        distance(i,j+1,er,ec,dis+1,grid);
        }
        if(j-1>=0&&grid[i][j-1]!=-1&&grid[i][j-1]>dis)
        {
        grid[i][j-1]=dis;
        distance(i,j-1,er,ec,dis+1,grid);
        }
        if(i-1>=0&&grid[i-1][j]!=-1&&grid[i-1][j]>dis)
        {
        grid[i-1][j]=dis;
        distance(i-1,j,er,ec,dis+1,grid);
        }
    }
}
