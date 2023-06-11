https://leetcode.com/problems/k-closest-points-to-origin/

class Solution {
public:
    vector<vector<int>> kClosest(vector<vector<int>>& points, int k) {
        
        int n = points.size();
        priority_queue<pair<int, pair<int, int>>> pq; // max heap
        
        for(int i=0; i<n; i++) {
            int dist = points[i][0]*points[i][0] + points[i][1]*points[i][1];
            pq.push({dist, {points[i][0], points[i][1]}});
            if(pq.size()>k) {
                pq.pop();
            }
        }
        
        vector<vector<int>> ans;
        while(!pq.empty()) {
            pair<int, int> coor = pq.top().second;
            ans.push_back({coor.first, coor.second});
            pq.pop();
        }
        
        return ans;   
    }
};