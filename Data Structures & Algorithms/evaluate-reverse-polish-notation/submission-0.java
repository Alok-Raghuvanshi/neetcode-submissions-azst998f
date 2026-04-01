class Solution {
    public int evalRPN(String[] tokens) {
      int n=tokens.length;
      if(n==1)
      return Integer.parseInt(tokens[0]);
      int i,r=0;
      Stack<Integer>st=new Stack<>();
      for(i=0;i<n;i++)
      {
        if(tokens[i].equals("+")&&(st.size()>=2))
        {
            int n1=st.pop();
            int n2=st.pop();
            r=n2+n1;
            st.push(r);
        }
        else if(tokens[i].equals("-")&&(st.size()>=2))
        {
            int n1=st.pop();
            int n2=st.pop();
            r=n2-n1;
            st.push(r);
        }
        else if(tokens[i].equals("/")&&(st.size()>=2))
        {
            int n1=st.pop();
            int n2=st.pop();
            r=n2/n1;
            st.push(r);
        }
        else if(tokens[i].equals("*")&&(st.size()>=2))
        {
            int n1=st.pop();
            int n2=st.pop();
            r=n2*n1;
            st.push(r);
        }
        else
        {
            st.push(Integer.parseInt(tokens[i]));
        }
      }
      return r;  
    }
}