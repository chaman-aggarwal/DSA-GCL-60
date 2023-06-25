https://leetcode.com/problems/minimum-path-sum/

class Solution {
    public int minPathSum(int[][] grid) {
        
        int n = grid.length;
        int m = grid[0].length;
        
        for(int i=1; i<n; i++) {
            grid[i][0] = grid[i-1][0] + grid[i][0];
        }
        
        for(int i=1; i<m; i++) {
            grid[0][i] = grid[0][i-1] + grid[0][i];
        }
        
        for(int i=1; i<n; i++) {
            for(int j=1; j<m; j++) {
                grid[i][j] = Math.min(grid[i-1][j], grid[i][j-1]) + grid[i][j];
            }
        }
        
        return grid[n-1][m-1];
    }
}