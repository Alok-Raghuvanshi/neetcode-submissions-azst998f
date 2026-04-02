class Solution {
    public boolean exist(char[][] board, String word) {
       int rowend=board.length;
       int colend=board[0].length;
       for(int i = 0; i < rowend; i++){
            for(int j = 0; j < colend; j++){
                if(search(i, j,rowend,colend, board, word, 0))
                    return true;
            }
       }
       return false;
    }
   boolean search(int r,int c,int rowend,int colend,char board[][],String word,int i)
   {
    if(i==word.length()) return true;
    if(r<0||c<0||r>=rowend||c>=colend||word.charAt(i)!=board[r][c]) return false;
    
    
     board[r][c]='.';
     boolean check= ((search(r+1,c,rowend,colend,board,word,i+1))||(search(r,c+1,rowend,colend,board,word,i+1))||(search(r-1,c,rowend,colend,board,word,i+1))||(search(r,c-1,rowend,colend,board,word,i+1)));
      board[r][c]=word.charAt(i);

    return check;
   }
}
