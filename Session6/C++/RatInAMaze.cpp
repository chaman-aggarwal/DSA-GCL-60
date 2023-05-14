https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1

class Solution{
    
    vector<int> dirx = {1, 0, 0, -1};
    vector<int> diry = {0, -1, 1, 0};
    
    bool isValidMove(int i, int j, int n, vector<vector<int>>& grid) {
        return i >= 0 && j >= 0 && i < n && j < n && grid[i][j] == 1;
    }
    
    void solve(int i, int j, vector<vector<int>> &grid, int n, vector<string> &ans, string path) 
    {
        if (i == n-1 && j == n-1) {
            ans.push_back(path);
            return;
        }
        
        string dir = "DLRU";
        for (int ind = 0; ind < 4; ind++) {
            int nexti = i + dirx[ind];
            int nextj = j + diry[ind];
            if (isValidMove(nexti, nextj, n, grid)) {
                grid[i][j] = 0;
                solve(nexti, nextj, grid, n, ans, path + dir[ind]);
                grid[i][j] = 1;
            }
        }
    } 
    
    public:
    vector<string> findPath(vector<vector<int>> &m, int n) {
        vector <string> ans;
        if (m[0][0] == 1) {
            solve(0, 0, m, n, ans, "");    
        }
        return ans;
    }
};