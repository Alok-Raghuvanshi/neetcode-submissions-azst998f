class Solution {

    public String encode(List<String> strs) {
        StringBuilder s=new StringBuilder();
         for(int i=0;i<strs.size();i++)
         {
            String st=strs.get(i);
          s.append(st.length()+"#"+st);
         } 
         return s.toString();
    }


    public List<String> decode(String str) {
        List<String>list=new ArrayList<>();
        StringBuilder s=new StringBuilder();
         StringBuilder len=new StringBuilder();
        int i=0;
        int l=0;
       while(i<str.length())
       {
        l=0;
        while(i<str.length()&&str.charAt(i)!='#')
        {
        char chh=str.charAt(i++);
        l=l*10+((int)chh-48);
        }

        if(str.charAt(i)=='#')
        {
            i++;
        while(l>0&&i<str.length())
        {
         s.append(str.charAt(i++));
         l--;
        }
        list.add(s.toString());
        s.setLength(0);
    }
       }
    return list;
}
}
