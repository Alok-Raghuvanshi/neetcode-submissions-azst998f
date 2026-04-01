class Solution {
    public String minWindow(String s, String t) {
      int map[]=new int[256];int si=-1;
      int l=0,r=0,count=0,minlen=Integer.MAX_VALUE;
      for(int k=0;k<t.length();k++)
      {
          map[(int)t.charAt(k)]++;
     }
      while(r<s.length())
      {  
       if(map[(int)s.charAt(r)]>0)
       {
          count++;
       }
         map[(int)s.charAt(r)]--;
        while(count==t.length())
        {
            if(r-l+1<minlen)
            {
                minlen=r-l+1;
                si=l;
            }
                map[(int)s.charAt(l)]++;
                if( map[(int)s.charAt(l)]>0) count--;
               l++;
        }
       r++;
      }
      return (si==-1)?"":s.substring(si,si+minlen);  
    }
}