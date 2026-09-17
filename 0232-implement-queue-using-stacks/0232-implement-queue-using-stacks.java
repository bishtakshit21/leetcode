class MyQueue {
private Deque <Integer> stack;
private Deque <Integer> queue;
    public MyQueue() {
        stack=new ArrayDeque<>();
        queue=new ArrayDeque<>();
    }
    
    public void push(int x) {
         while(!queue.isEmpty()){
            stack.push(queue.pop());
        }
        stack.push(x);
    }
    
    public int pop() {
        while(!stack.isEmpty()){
            queue.push(stack.pop());
        }
       return queue.pop();
    }
    
    public int peek() {
         while(!stack.isEmpty()){
            queue.push(stack.pop());
        }
       return queue.peek();
       
         
    }
    
    public boolean empty() {
        return queue.isEmpty()&&stack.isEmpty();
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