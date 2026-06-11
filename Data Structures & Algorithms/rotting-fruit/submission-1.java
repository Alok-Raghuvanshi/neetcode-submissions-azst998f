class Solution {
    class Pair {
    int r;
    int c;

    Pair(int r, int c) {
        this.r = r;
        this.c = c;
    }
 }
 int rot=0;
    public int orangesRotting(int[][] grid) {
    int total=0;
     List<Pair>l=new ArrayList<>();
     int row=grid.length;
     int col=grid[0].length;
     for(int i=0;i<row;i++)
     {
        for(int j=0;j<col;j++)
        {
            if(grid[i][j]==2)
            {
                Pair p=new Pair(i,j);
                l.add(p);
            }
            if(grid[i][j]!=0) total++;
        }
     }
     rot=l.size();
     int fresh=total-rot;
     int count=0;
     while(l.size()!=0)
     {
        l=rot(l,grid,row,col);
        if(l.size()>0)
        count++;
     }
     return (rot==total)?count:-1;
    }
    List<Pair> rot(List<Pair>l,int grid[][],int row,int col)
    {
        List<Pair>nl=new ArrayList<>();
        for(int i=0;i<l.size();i++)
        {
            Pair pr=l.get(i);
            int r=pr.r;
            int c=pr.c;
            if(r+1<row&&grid[r+1][c]==1)
            {
                rot++;
                Pair p =new Pair(r+1,c);
                nl.add(p);
                grid[r+1][c]=2;
            }
            if(r-1>=0&&grid[r-1][c]==1)
            {
                rot++;
                Pair p =new Pair(r-1,c);
                nl.add(p);
                grid[r-1][c]=2;
            }
            if(c+1<col&&grid[r][c+1]==1)
            {
                rot++;
                Pair p =new Pair(r,c+1);
                nl.add(p);
                grid[r][c+1]=2;
            }
            if(c-1>=0&&grid[r][c-1]==1)
            {
                rot++;
                Pair p =new Pair(r,c-1);
                nl.add(p);
                grid[r][c-1]=2;
            }
        }
        return nl;
    }
}