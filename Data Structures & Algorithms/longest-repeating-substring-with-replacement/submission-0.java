class Solution {
    public int characterReplacement(String s, int k) {
     int n=s.length();
     int l=0,r=0;
     int maxlen=0;
     int maxfreq=0;
     HashMap<Character,Integer>map=new HashMap<>();
     for(int i=0;i<26;i++)
     {
      map.put((char) ('A'+i),0);
     }  
     while(r<n)
     {
      char key=s.charAt(r);
      map.put(key, map.get(key)+1);
      maxfreq=Math.max(maxfreq,map.get(key));
      while((r-l+1)-maxfreq>k)
      {
        map.put(s.charAt(l), map.get(s.charAt(l))-1);
       l++;
      } 
        maxlen=Math.max(maxlen,r-l+1);
        r++;
     }
     return maxlen;
    }
}
