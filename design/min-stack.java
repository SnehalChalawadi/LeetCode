class MinStack {
    Stack<Integer> stack;
    Stack<Integer> stack2;
    public MinStack() {
        stack=new Stack<>();
        stack2=new Stack<>();
    }
    
    public void push(int value) {
        stack.push(value);
        if(stack2.isEmpty())
        {
            stack2.push(value);
        }
        else{
            stack2.push(Math.min(stack2.peek(),value));
        }
    }
    
    public void pop() {
        stack.pop();
        stack2.pop();
    }
    
    public int top() {
       return stack.peek();
    }
    
    public int getMin() {
       return stack2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */