class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
        return nums[0];
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
      return house(nums,0,dp);  
    }
    int house(int num[],int idx,int dp[])
    {
        if(idx>=num.length) return 0;
    
        if(dp[idx]!=-1) return dp[idx];
        int rob=num[idx]+house(num,idx+2,dp);
        int skip=house(num,idx+1,dp);

        return dp[idx]=Math.max(rob,skip);
    }
}
