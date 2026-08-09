class MinStack {
    Stack<Integer> st;
    Stack<Integer> min;
    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(min.empty() || val <= min.peek()){
            min.push(val);
        }
    }
    
    public void pop() {
        if(st.empty())return;
        int val = st.pop();
        if(min.peek() == val){
            min.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
