class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        if(n>0)
        return pow(x,n);
        else
        return pow((1/x),-n);
    }
    double pow(double x,int n)
    {
        double p=1.0000;
        for(int i=0;i<n;i++)
        {
         p=p*x;
        }
        return p;
    }
}
