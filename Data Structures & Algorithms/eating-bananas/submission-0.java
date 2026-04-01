class Solution {
    public int minEatingSpeed(int[] piles, int h) { 
     int max=Integer.MIN_VALUE; 
     for(int p:piles)
     {
        max=Math.max(max,p);
     } 
     int l=1;
     int r=max;
     while(l<=r)
     {
        int mid=l+(r-l)/2;
        int f=check(piles,mid);
        if(f<=h)
        {   
        r=mid-1;
        }
        else
        l=mid+1;
     } 
     return l;
    }
    int check(int piles[],int mid)
    {
        int count=0;
        for(int p:piles)
        {
         count+=(int)Math.ceil((double)p/mid);
        }
        return count;
    }
}
