class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    List<String>str=new ArrayList<>();
    for(String s:strs)
    str.add(s);

        List<List<String>>outer=new ArrayList<>();
        
        for(int i=0;i<str.size();i++)
        {
            List<String>inner=new ArrayList<>();
         String st=str.get(i);
         inner.add(st);
         for(int j=i+1;j<str.size();j++)
         {
            if(anagram(st,str.get(j)))
            {
                inner.add(str.get(j));
                str.remove(j);
                j=i;
            }
         }
         outer.add(inner);
        }
        return outer;
    }
    boolean anagram(String s,String t)
    {
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
       