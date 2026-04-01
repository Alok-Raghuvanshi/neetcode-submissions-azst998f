class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int j=n-1,i=0;
        int maxwater=0;
        while(i<j)
        {
       int water=Math.min(heights[i],heights[j])*(j-i);
        maxwater=Math.max(water,maxwater);
       if(heights[i]>=heights[j])
       j--;
       else
       i++;
        }
        
        return maxwater;
    }
}
