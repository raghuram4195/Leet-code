import java.util.Queue;
class MyStack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
    public MyStack() {

    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        int n = q1.size();
        int temp=0;
        for(int i=0;i<n-1;i++)
        {
            temp = q1.peek();
            q1.remove();
            q2.add(temp);
        }
        int res =q1.remove();
        for(int i=0;i<n-1;i++)
        {
             temp = q2.peek();
            q2.remove();
            q1.add(temp);
        }
        return res;
    }
    
    public int top() {
                int n = q1.size();
        int temp=0;
        for(int i=0;i<n;i++)
        {
            temp = q1.peek();
            q1.remove();
            q2.add(temp);
        }
        
        for(int i=0;i<n;i++)
        {
            temp = q2.peek();
            q2.remove();
            q1.add(temp);
        }
        return temp;
    }
    
    public boolean empty() {
        if(q1.size()==0)
            return true;
        else
            return false;
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