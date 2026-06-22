class Solution {
    public boolean canJump(int[] nums) {
       int n=nums.length;
       return check(0,n,nums); 
    }
    boolean check(int i,int n,int nums[])
    {
        if(i==n-1)
        return true;
        
        else
        {
            for(int j=1;j<=nums[i];j++)
            {
            if(check(i+j,n,nums))
               return true;
            }
        }
        return false;
    }
}
