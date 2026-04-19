class Solution {
    public String longestPalindrome(String s) {
        int i=0,start=0,end=0;
        int n=s.length();
        for(i=0;i<n;i++)
        {
            int l1=expand(s,i,i);   //for odd palindrome 
            int l2=expand(s,i,i+1); //for even palindrome

            int l=Math.max(l1,l2);
            if(l>end-start)
            {
                start=i-(l-1)/2;
                end=i+(l/2);
            }
        }
        return s.substring(start,end+1);
    }
    int expand(String s,int l,int r)
    {
        while(l>=0&&l<=r&&r<s.length()&&s.charAt(l)==s.charAt(r))
        {
            l--;
            r++;
        }
        return r-l-1;
    }
}
