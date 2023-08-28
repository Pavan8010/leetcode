class MyStack {
    Deque<Integer> deque;
    public MyStack() {
        deque = new ArrayDeque<>();
        // queue = new LinkedList<>();
    }
    public void push(int x) {
        deque.addFirst(x);   
    }
    
    public int pop() {
        return deque.removeFirst();
    }
    
    public int top() {
        return deque.getFirst();
    }
    
    public boolean empty() {
        return deque.size() == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */