class Solution {
    public int climbStairs(int n) {
     int p1=1;
     int p2=2;
     int curr=0;
     if(n<=2) return n;

     for(int i=3;i<=n;i++)
     {
       curr=p1+p2;
       p1=p2;
       p2=curr;
     }
     return p2;
    }
}
