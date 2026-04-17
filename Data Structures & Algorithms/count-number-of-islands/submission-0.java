class Solution {
    public int numIslands(char[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int sum=0;
     boolean a[][]=new boolean[r][c];
     for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(grid[i][j]=='0'||a[i][j]==true) continue;
                else
                {
             island(grid,i,j,r,c,a); 
             sum++;
                }
            }
        }
       return sum;  
    }
    void island(char[][] grid,int sr,int sc,int er,int ec,boolean[][] g)
    {
        if(grid[sr][sc]=='0'||g[sr][sc]==true) return ;
        
                
        g[sr][sc]=true;
        if(sc+1<ec)
        island(grid,sr,sc+1,er,ec,g);
        if(sc-1>=0)
        island(grid,sr,sc-1,er,ec,g);
        if(sr+1<er)
        island(grid,sr+1,sc,er,ec,g);
        if(sr-1>=0)
        island(grid,sr-1,sc,er,ec,g);
        
    }
}
