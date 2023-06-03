https://leetcode.com/problems/implement-stack-using-queues/

class MyStack {
    
    Queue<Integer> queue = new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
       int size = queue.size();
       queue.add(x);
       while(size>0) {
           queue.add(queue.poll());
           size--;
       }
    }
    
    public int pop() {
        
        return queue.poll();
        
    }
    
    public int top() {
        
        return queue.peek();
        
    }
    
    public boolean empty() {
        
        return queue.isEmpty();
        
    }
}