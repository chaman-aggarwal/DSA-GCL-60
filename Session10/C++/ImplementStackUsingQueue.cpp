https://leetcode.com/problems/implement-stack-using-queues/

class MyStack {
public:
    queue<int> q;
    MyStack() {
        
    }
    
    void push(int x) {
        
        int size = q.size();
        q.push(x);
        while(size--)
        {
            q.push(q.front());
            q.pop();
        }
    }
    
    int pop() {
        
        int result = q.front();
        q.pop();
        return result;
        
    }
    
    int top() {
        
        return q.front();
        
    }
    
    bool empty() {
        
        return q.empty();
        
    }
};