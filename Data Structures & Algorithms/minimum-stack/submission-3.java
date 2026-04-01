class MinStack {
    Stack<Integer>st=new Stack<>();
    Stack<Integer>minst=new Stack<>();
    int min=Integer.MAX_VALUE;
    public MinStack() {      
    }  
    public void push(int val) {
        st.push(val);
        if(minst.isEmpty()||minst.peek()>=val)
        minst.push(val);
        else
        minst.push(minst.peek());
    }
    public void pop() {
        st.pop();
        minst.pop();
    } 
    public int top() {
        return st.peek();
    }
    public int getMin() {
        return minst.peek();
    }
}
