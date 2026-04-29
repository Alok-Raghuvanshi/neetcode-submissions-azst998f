class Solution {
    public boolean canPartition(int[] nums) {
       int n=nums.length;
       int total=0;
       for(int num:nums) total+=num;

       if(total%2!=0) return false;
       int target=total/2;
        long limit=1L<<n;    //pow(2,n)
        for(int mask=0;mask<limit;mask++)
        {
            int sum=0;
            for(int j=0;j<n;j++)
            {
                if((mask&(1<<j))!=0) sum+=nums[j];
                 
            }
            if(sum==target) return true;
        }
        return false;
    }
}
