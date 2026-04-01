class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l1=s1.length(),l2=s2.length();
        if(l1>l2) return false;
      int a1[]=new int[26];int count=0;
      for(int i=0;i<l1;i++)
      {
        int ascii=(int)s1.charAt(i)-97;
        a1[ascii]++;
      }
       int i=0,j=l1-1;
       int check[]=new int[26];
        for(int t=i;t<=j;t++)
        {
             check[(int)(s2.charAt(t)-97)]++;
        }
       while(j<l2)
       {
        for(int g=0;g<26;g++)
        {
            if(check[g]!=a1[g])
            {
            count=-1;
            break;
            }
        }
        if(count==0)
        return true;
        else
        {
        count=0;
        check[s2.charAt(i)-97]--;    
        i++;
         j++;
        if(j<l2){
        check[(int)s2.charAt(j)-97]++;}
        }
       }
       return false;
    }
}
