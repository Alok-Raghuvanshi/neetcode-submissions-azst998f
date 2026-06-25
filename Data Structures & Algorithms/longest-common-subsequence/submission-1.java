class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int memo[][]=new int[text1.length()+1][text2.length()+1];
        return dp(0,0,memo,text1,text2);
    }
    int dp(int i,int j,int memo[][],String t1,String t2)
    {
        if(i>=t1.length()||j>=t2.length())
        return 0;
        
        if(memo[i][j]!=0)
        return memo[i][j];
        if(t1.charAt(i)==t2.charAt(j))
        {
        memo[i][j]= 1+dp(i+1,j+1,memo,t1,t2);
        return memo[i][j];
        }
        else
        {
            memo[i][j]=Math.max(dp(i+1,j,memo,t1,t2),dp(i,j+1,memo,t1,t2));
            return memo[i][j];
        }
    }
}
