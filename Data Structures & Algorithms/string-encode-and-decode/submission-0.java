class Solution {

    public String encode(List<String> strs) {
        StringBuilder s=new StringBuilder();
         for(int i=0;i<strs.size();i++)
         {
          s.append(strs.get(i)+"€");
         } 
         return s.toString();
    }


    public List<String> decode(String str) {
        List<String>list=new ArrayList<>();
        StringBuilder s=new StringBuilder();
       for(int i=0;i<str.length();i++)
       {
        String st=str.charAt(i)+"";
        if(st.equals("€"))
        {
        list.add(s.toString());
        s.setLength(0);
       }
       else
       s.append(st);
    }
    return list;
}
}
