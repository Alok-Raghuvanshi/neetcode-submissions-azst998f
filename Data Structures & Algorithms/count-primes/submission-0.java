class Solution {
    public int countPrimes(int n) {
        if (n<=2)
        return 0;
       boolean b[]=new boolean[n+1];
        Arrays.fill(b,true);
        b[0]=false;
        b[1]=false;

        for(int i=2;i*i<=n;i++)
        {
            if(b[i])
            {
                for(int j=i*i;j<n;j+=i)
                b[j]=false;
            }
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(b[i])
            c++;
        } 
        return c; 
    }
}