https://leetcode.com/problems/rotting-oranges/

typedef pair<int, pair<int, int>> Node;
class Solution {   
public:
    int orangesRotting(vector<vector<int>>& grid) {
        
        int n = grid.size();
        int m = grid[0].size();
        queue<Node> q;
        int fresh = 0;
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(grid[i][j]==2) {
                    q.push({i, {j, 0}});
                }
                else if(grid[i][j]==1) {
                    fresh++;
                }
            }
        }
        
        vector<vector<int>> dirs = {{0,1}, {0,-1}, {1,0}, {-1,0}};
        int time = 0;
        while(!q.empty()) {
            Node node = q.front();
            q.pop();
            time= node.second.second;
            for(auto dir:dirs) {
                int row = node.first + dir[0];
                int col = node.second.first + dir[1];
                if(row >=0 && row<n && col>=0 && col<m && grid[row][col]==1) {
                    grid[row][col] = 2;
                    fresh--;
                    q.push({row, {col, time+1}});
                }
            }
        }
        return fresh==0 ? time : -1;
    }
};