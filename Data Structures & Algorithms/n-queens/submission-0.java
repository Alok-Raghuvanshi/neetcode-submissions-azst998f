class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        List<List<String>> board = new ArrayList<>();

        for(int i=0;i<n;i++) {
            List<String> row = new ArrayList<>();
            for(int j=0;j<n;j++) {
                row.add(".");
            }
            board.add(row);
        }
        queens(n,0,board,result);
        return result;
    }
    void queens(int n,int row,List<List<String>>board,List<List<String>>result)
    {
        if(row==n)
        {
           List<String>temp=new ArrayList<>();
            for(List<String>r:board) 
            {
                 temp.add(String.join("", r)); 
                 } 
                 result.add(temp); 
                 return;
                  }

        for(int c=0;c<n;c++)
        {
            if(safe(board,row,c,n))
            {
            board.get(row).set(c,"Q");
            queens(n,row+1,board,result);
            board.get(row).set(c,".");
            }
        }
    }
    boolean safe(List<List<String>> board,int r,int c,int n)
     {
    for(int i=0;i<r;i++)
        if(board.get(i).get(c).equals("Q")) return false;


    for(int i=r-1,j=c-1;i>=0 && j>=0;i--,j--)
        if(board.get(i).get(j).equals("Q")) return false;


    for(int i=r-1,j=c+1;i>=0 && j<n;i--,j++)
        if(board.get(i).get(j).equals("Q")) return false;

    return true;
    }
}
