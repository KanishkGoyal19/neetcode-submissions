class MinStack {
    Stack<Integer> minStack = new Stack<>();
    Stack<Integer> s = new Stack<>();

    public MinStack() {        
    }
    
    public void push(int val) {
        if(minStack.empty()){
            s.push(val);
        }
        else if(val <= s.peek()){
            s.push(val);
        }
        minStack.push(val);
    }
    
    public void pop() {
        if(minStack.peek().equals(s.peek()) ){
            s.pop();
        }
        minStack.pop();
    }
    
    public int top() {
        return minStack.peek();
    }
    
    public int getMin() {
        return s.peek();
    }
}
