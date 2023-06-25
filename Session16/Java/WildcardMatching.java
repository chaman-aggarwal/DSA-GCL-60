https://leetcode.com/problems/wildcard-matching/

class Solution {
    public boolean isMatch(String s, String p) {
        
        int n = s.length();
        int m = p.length();
        boolean dp[][] = new boolean[n+1][m+1];
        dp[0][0] = true;
        
        for(int j=0; j<m && p.charAt(j)=='*'; j++) {
            dp[0][j+1] = true;
        }
        
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?') {
                    dp[i][j] = dp[i-1][j-1];
                }
                else if(p.charAt(j-1)=='*') {
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                }
            }
        }
        
        return dp[n][m];
    }
}