class Solution {
    public String multiply(String num1, String num2) {
       int n=num1.length();
       int m=num2.length();

       int res[]=new int[n+m];
       int sum=0;
       for(int i=n-1;i>=0;i--)
       {
        for(int j=m-1;j>=0;j--)
        {
          int mul=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
          int p1 = i+j;
          int p2 = i+j+1;
          sum = mul+res[p2];
          res[p2]=sum%10;
          res[p1]+=sum/10;
        }
       } 
       int i=0;
       while(i<res.length&&res[i]==0) i++;
       if(i==res.length) return "0";
        StringBuilder s=new StringBuilder();
       for(int j=i;j<n+m;j++)
       {
         s.append(res[j]);
       }
       return s.toString();
    }
}
