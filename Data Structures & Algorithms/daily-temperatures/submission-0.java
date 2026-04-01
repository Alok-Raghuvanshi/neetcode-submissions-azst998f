class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       int n=temperatures.length;
       int r[]=new int[n];
       Stack<Integer>st=new Stack<>();
       for(int i=n-1;i>=0;i--)
       {
       if(st.isEmpty())
       {
        st.push(i);
        r[i]=0;
        }
        else
        {
          while(!(st.isEmpty())&&temperatures[st.peek()]<=temperatures[i])
          st.pop();

          if(!st.isEmpty())
          r[i]=(st.peek()-i);
          
          st.push(i);
        }
    }
    return r;
}
}
