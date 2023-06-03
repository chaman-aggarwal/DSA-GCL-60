https://leetcode.com/problems/asteroid-collision/

class Solution {
public:
    vector<int> asteroidCollision(vector<int>& asteroids) {
        // collision => s.top() (+) && i (-) 
        stack<int> s;
        for(auto i:asteroids) {
            if(s.empty() || i>0 || s.top()<0) {
                s.push(i);
            }
            else {
                bool destroyed = false;
                while(!s.empty() && s.top()>0 && !destroyed) {
                    int tp = s.top();
                    if(abs(i) > tp) {
                       s.pop(); 
                    }
                    else if(abs(i) < tp) {
                        destroyed = true;
                    }
                    else {
                        s.pop();
                        destroyed = true;
                    }
                }
                if(!destroyed) {
                    s.push(i);
                }
            }
        }
        
        vector<int> ans(s.size());
        int index = s.size()-1;
        while (!s.empty()) {
            ans[index--] = s.top();
            s.pop();
        }

        return ans;
        
    }
};