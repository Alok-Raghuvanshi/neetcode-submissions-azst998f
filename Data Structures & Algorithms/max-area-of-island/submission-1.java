class Solution {
    int max=Integer.MIN_VALUE;
    public int maxAreaOfIsland(int[][] grid) {
       int r=grid.length;
       int c=grid[0].length;
       for(int i=0;i<r;i++)
       {
        for(int j=0;j<c;j++)
        {
            if(grid[i][j]==1)
            max=Math.max(max,count(grid,i,r-1,j,c-1));
        }
       }
       return (max==Integer.MIN_VALUE)?0:max; 
    }
    int count(int grid[][],int sr,int er,int sc,int ec)
    {
        
        if(sr<0||sr>er||sc<0 ||sc>ec||grid[sr][sc]==0)
        return 0;

        grid[sr][sc]=0;
        
       int ans= 1+count(grid,sr,er,sc+1,ec)+   
        count(grid,sr+1,er,sc,ec)+
        count(grid,sr-1,er,sc,ec)+    
        count(grid,sr,er,sc-1,ec);

        return ans;
    }
}
