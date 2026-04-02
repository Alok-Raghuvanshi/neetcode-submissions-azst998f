class Solution {
    public List<String> generateParenthesis(int n) {
     List<String>l=new ArrayList<>();
     StringBuilder st=new StringBuilder();
     parenthesis(st,0,0,n,l);
     return l;   
    }
    void parenthesis(StringBuilder st,int open,int close,int n,List<String>l)
    {
        if(open+close==2*n)
        {
            l.add(st.toString()); 
            return;  
        }
        if(open<n)
        {
            st.append("(");
            parenthesis(st,open+1,close,n,l);
            st.deleteCharAt(st.length()-1);
        }
        if(open>close)
        {
          st.append(")");
          parenthesis(st,open,close+1,n,l);
          st.deleteCharAt(st.length()-1);
        }
    }
}
