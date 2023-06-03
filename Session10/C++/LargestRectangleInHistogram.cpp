https://leetcode.com/problems/largest-rectangle-in-histogram/

class Solution {
public:
    int largestRectangleArea(vector<int>& heights) {
        
        stack<int> s;
        int n = heights.size();
        int currArea = 0;
        int maxArea = 0;
        int i = 0;
        
        if(n==0) {
            return 0;
        }
        
        while(i<n) {
            while(!s.empty() && heights[i] < heights[s.top()]) {
                int top = s.top();
                s.pop();
                currArea = heights[top] * (s.empty() ? i : i - s.top() - 1);
                maxArea = max(currArea, maxArea);
            }
            s.push(i++);
        }
        
        while(!s.empty()) {
            int top = s.top();
            s.pop();
            currArea = heights[top] * (s.empty() ? i : i - s.top() - 1);
            maxArea = max(currArea, maxArea);
        }
        
        return maxArea;
        
    }
};