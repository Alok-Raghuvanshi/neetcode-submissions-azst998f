class Solution {
    int c=Integer.MAX_VALUE;
    public int coinChange(int[] coins, int amount) {
      int res= coins(coins,amount,coins.length-1,0);
      return res>=1e9?-1:res;  
    }
    int coins(int coins[],int amt,int i,int count)
    {
        int take=Integer.MAX_VALUE;
        int nottake=0;
        if(i==0)
        {
         if(amt%coins[i]==0) return amt/coins[i];
         else
         return (int)1e9;   
        }
        nottake=coins(coins,amt,i-1,0);
        if(coins[i]<=amt)
        take=1+coins(coins,amt-coins[i],i,0);

        return Math.min(nottake,take);
    }
}
