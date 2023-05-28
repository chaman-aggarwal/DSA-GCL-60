https://leetcode.com/problems/daily-temperatures/

class Solution {
public:
    vector<int> dailyTemperatures(vector<int>& T) {
        
        int n = T.size();
        stack<int> s;
        
        vector<int> ans(n, 0);
        
        for(int i=0; i<n; i++)
        {
            while(!s.empty() && T[i] > T[s.top()])
            {
                ans[s.top()] = i-s.top();
                s.pop();
            }
            s.push(i);
        }
        
        return ans;
        
    }
};