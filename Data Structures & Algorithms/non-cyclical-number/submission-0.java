class Solution {
    public boolean isHappy(int n) {
      HashSet<Integer>set=new HashSet<>();
      while(n!=1)
      {
        int sum=0;
          while(n>0)

          {
            int r=n%10;
            sum=sum+(r*r);
            n=n/10;
          }
          n=sum;
          if(set.contains(n)) return false;
          set.add(n);
      }
      return true;
    }
}
