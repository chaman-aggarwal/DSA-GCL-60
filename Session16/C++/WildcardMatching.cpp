https://leetcode.com/problems/wildcard-matching/

class Solution {
public:
    bool isMatch(string s, string p) {
        
        int n = s.size();
        int m = p.size();
        vector<vector<bool>> dp(n+1, vector<bool>(m+1, false));
        dp[0][0] = true;
        
        for(int j=0; j<m && p[j]=='*'; j++) {
            dp[0][j+1] = true;
        }
        
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                // diagonal
                if(s[i-1]==p[j-1] || p[j-1]=='?') {
                    dp[i][j] = dp[i-1][j-1];
                }
                // top or left
                else if(p[j-1]=='*') {
                    dp[i][j] = dp[i][j-1] || dp[i-1][j];
                }
            }
        }
        return dp[n][m];
    }
};