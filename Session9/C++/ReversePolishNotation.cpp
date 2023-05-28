https://leetcode.com/problems/evaluate-reverse-polish-notation/

class Solution {

    int performOperation(string token, int y, int x) {
        if (token == "+") {
            return y + x;
        } else if (token == "-") {
            return y - x;
        } else if (token == "*") {
            return y * x;
        } else {
            return y / x;
        }
    }

public:
    int evalRPN(vector<string>& tokens) {
        
        stack<int> s;
        for(auto token:tokens)
        {
            if(token=="+" || token=="-" || token=="*" || token=="/") {
                int x = s.top();
                s.pop();
                int y = s.top();
                s.pop();
                s.push(performOperation(token, y, x));
            }
            else {
                s.push(stoi(token));
            }
        }
        
        return s.top();
        
    }
};