class MyQueue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
    public MyQueue() {

    }
    
    public void push(int x) {
    s1.push(x);
    }
    
    public int pop() {
        int n = s1.size();
            for(int i=0;i<n-1;i++)
            {
                s2.push(s1.pop());
            }
        int kk =s1.pop();
        for(int i=0;i<n-1;i++)
        {
            s1.push(s2.pop());
        }
        return kk;
    }
    
    public int peek() {
        int n = s1.size();
            for(int i=0;i<n-1;i++)
            {
                s2.push(s1.pop());
            }
        int kk =s1.peek();
        for(int i=0;i<n-1;i++)
        {
            s1.push(s2.pop());
        }
        return kk;
    }
    
    public boolean empty() {
        return s1.empty();
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