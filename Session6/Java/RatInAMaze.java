https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1

class Solution {
    
    private static final int[] DIR_X = {1, 0, 0, -1};
    private static final int[] DIR_Y = {0, -1, 1, 0};
    
    private static boolean isValidMove(int i, int j, int n, int[][] grid) {
        return i >= 0 && j >= 0 && i < n && j < n && grid[i][j] == 1;
    }
    
    private static void solve(int i, int j, int grid[][], int n, ArrayList <String> ans, String path) 
    {
        if (i == n-1 && j == n-1) {
            ans.add(path);
            return;
        }
        
        String dir = "DLRU";
        for (int ind = 0; ind < 4; ind++) {
            int nexti = i + DIR_X[ind];
            int nextj = j + DIR_Y[ind];
            if (isValidMove(nexti, nextj, n, grid)) {
                grid[i][j] = 0;
                solve(nexti, nextj, grid, n, ans, path + dir.charAt(ind));
                grid[i][j] = 1;
            }
        }
    }
    
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList <String> ans = new ArrayList <> ();
        if (m[0][0] == 1) {
            solve(0, 0, m, n, ans, "");    
        }
        return ans;
    }
}