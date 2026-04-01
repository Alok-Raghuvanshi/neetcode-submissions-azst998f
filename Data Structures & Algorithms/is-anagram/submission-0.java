class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
    int array[]=new int[26];
     for(int i=0;i<s.length();i++)
     {
        char ch=s.charAt(i);
        int j=(int)ch-97;
        array[j]++;
     }
      for(int i=0;i<t.length();i++)
     {
        char ch=t.charAt(i);
        int j=(int)ch-97;
        if(array[j]>0)
        array[j]--;
     }
     for(int i=0;i<26;i++)
     {
        if(array[i]!=0)
        return false;
     }
     return true;
    }
}
