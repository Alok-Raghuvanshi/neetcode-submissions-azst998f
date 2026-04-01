class Solution {
    public boolean isValidSudoku(char[][] board) {
       HashMap<String,Integer>row=new HashMap<>();
       HashMap<String,Integer>col=new HashMap<>(); 
       int cr=0,cc=0,sc=0;
       HashMap<String,Integer>sqr=new HashMap<>();
       
       for(int i=0;i<9;i++)
       {
        for(int j=0;j<9;j++)
        {
            if(board[j][i]!=('.'))
            {
                cr=row.getOrDefault(board[j][i]+"",0)+1;
                if(cr>1) return false;
            row.put(board[j][i]+"",cr);
            }
            if(board[i][j]!=('.'))
            {
                cc=col.getOrDefault(board[i][j]+"",0)+1;
                if(cc>1) return false;
            col.put(board[i][j]+"",cc);
            }
            
        }
       row.clear();
       col.clear();
       
       } 
       for(int i=0;i<9;i+=3)
       {
        for(int j=0;j<9;j+=3)
        {
              for(int k = i; k < i + 3; k++)
              {
              for(int l = j; l < j + 3; l++) 
              {
                if(board[k][l]!='.'){
               sc=sqr.getOrDefault(board[k][l]+"",0)+1;
               if(sc>1) return false;
               sqr.put(board[k][l]+"",sc);
                }
              }
        }
          sqr.clear();
        }
      
       }
       return true;
    }
}
