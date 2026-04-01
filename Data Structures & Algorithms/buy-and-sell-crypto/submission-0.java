class Solution {
    public int maxProfit(int[] prices) {
      int n=prices.length;
      int i=1,j=0;
      int max=0,lmin=prices[0];
      while(i<n)
      {
       max=Math.max(max,prices[i]-lmin);
       lmin=Math.min(lmin,prices[i]);
        i++;       
      }
      return max; 
    }
}
