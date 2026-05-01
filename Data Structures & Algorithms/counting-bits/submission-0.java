class Solution {
    public int[] countBits(int n) {
        int a[]=new int[n+1];
      for(int i=0;i<=n;i++)
      {
        int c=binary1s(i);
        a[i]=c;
      } 
      return a; 
    }
    int binary1s(int n)
    {
       int count=0;
     while(n>0)
     {
        n=n&(n-1);
        count++;
     } 
     return count; 
    }
}
