class MyQueue {
    private int front;
    private Stack<Integer> firstStack;
    private Stack<Integer> secondStack;

    public MyQueue() {
        firstStack = new Stack<Integer>();
        secondStack = new Stack<Integer>();
    }
    
    public void push(int x) {
        if(firstStack.empty()) front = x;
        firstStack.push(new Integer(x));
    }
    
    public int pop() {
        while(!firstStack.empty()) {
            secondStack.push(new Integer(firstStack.pop()));
        }
        Integer elementPopped = secondStack.pop();
        while(!secondStack.empty()) {
            push(secondStack.pop());
        }
        return elementPopped;
    }
    
    public int peek() {
        return front;
    }
    
    public boolean empty() {
        return firstStack.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */