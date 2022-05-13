class MyQueue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public MyQueue() {
       // s1.clear();
       // s2.clear();
    }
    
    public void push(int x) {
        s1.add(x);
    }
    
    public int pop() {
        int n = s1.size();
        s2.clear();
        for(int i=0;i<n;i++)
        {
            int temp = s1.pop();
            s2.push(temp);
            
        }
        int res = s2.peek();
        s2.pop();
       //System.out.println(n);
        //System.out.println(s2.size());
        for(int i=0;i<n-1;i++)
        {
            int temp = s2.pop();
            s1.push(temp);
           // System.out.println(s1.peek());
        }
        //System.out.println(s1.size());
        return res;
    }
    
    public int peek() {
        int n = s1.size();
        s2.clear();
        for(int i=0;i<n;i++)
        {
            int temp = s1.pop();
            s2.push(temp);
            
        }
        int res = s2.peek();

        for(int i=0;i<n;i++)
        {
            int temp = s2.pop();
            s1.push(temp);
        }
        return res;
    }
    
    public boolean empty() {
        return s1.isEmpty();
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