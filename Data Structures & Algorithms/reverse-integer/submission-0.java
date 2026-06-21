class Solution {
    public int reverse(int x) {
      int max=Integer.MAX_VALUE;
      int min=Integer.MIN_VALUE;
      
      long l=Math.abs(x);
      long sum=0;
      while(l>0)
      {
        long r=l%10;
        sum=sum*10+r;
        l=l/10;
      }
      if(x<0)
      sum=-sum;
     if(sum<=max&&sum>=min)
     return (int)sum;
     else 
     return 0;
    }
}
