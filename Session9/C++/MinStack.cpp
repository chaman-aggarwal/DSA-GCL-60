https://leetcode.com/problems/min-stack/

class MinStack {
public:
    /** initialize your data structure here. */
    stack<pair<int, int>> st;
    MinStack() {
        
    }
    
    void push(int x) {
        if(!st.empty()) {
            st.push({x, min(x, st.top().second)});
        }
        else {
            st.push({x, x});
        }
    }
    
    void pop() {
        st.pop();
    }
    
    int top() {
       return st.top().first;
    }
    
    int getMin() {
        return st.top().second;
    }
};