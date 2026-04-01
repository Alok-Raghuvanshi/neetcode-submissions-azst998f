class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
        return 0;
        int n=s.length();
      HashMap<Character,Integer>map=new HashMap<>();
      int i=0,j=0,max=0;
      while(j<n)
      {      
        while(j<n&&map.containsKey(s.charAt(j)))
        {
        map.remove(s.charAt(i));
        i++;
        }
        map.put(s.charAt(j),j);
            j++;
        max=Math.max(max,j-i);
      } 
      return max; 
    }
}