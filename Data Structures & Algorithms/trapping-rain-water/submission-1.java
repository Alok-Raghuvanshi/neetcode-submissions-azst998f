class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int l=0,r=n-1;
        int total=0;
        int lm=0,rm=0;
        while(l<r)
        {
       if(height[l]<=height[r])
         {
            if(lm>height[l])
            total+=lm-height[l];
            else
            lm=height[l];
            l++;
         }
         else
         {
            if(rm>height[r])
            total+=rm-height[r];
            else
            rm=height[r];
            r--;
         }
        }
        return total;
    }
}
