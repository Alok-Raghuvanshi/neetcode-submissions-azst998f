class Solution {
    public int lengthOfLIS(int[] nums) {
      int n=nums.length;
      int dp[][]=new int[n][n+1];
      for(int[] row : dp)
    Arrays.fill(row, -1);
      return longest(nums,0,-1,dp);
    }
    int longest(int nums[],int index,int previndex,int dp[][])
    {
      if(index==nums.length) return 0;
      
      if(dp[index][previndex+1]!=-1) return dp[index][previndex+1];
      int notTakeLen=0+longest(nums,index+1,previndex,dp);
      if(previndex==-1||nums[index]>nums[previndex])
      notTakeLen= Math.max(notTakeLen,1+longest(nums,index+1,index,dp));

      return dp[index][previndex+1]=notTakeLen;
    }
}
