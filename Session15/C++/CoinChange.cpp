https://leetcode.com/problems/coin-change/

class Solution {
public:
    int coinChange(vector<int>& coins, int amount) {
        
        sort(coins.begin(), coins.end());
        vector<int> dp(amount+1, amount+1);
        dp[0] = 0;
        
        for(int i=1; i<=amount; i++) {
            for(auto coin:coins) {
                // taking smaller or equal coins
                if(coin <= i) {
                    dp[i] = min(dp[i], dp[i-coin]+1);
                }
                // greater coin
                else {
                    break;
                }
            }
        }
        return dp[amount]==amount+1 ? -1 : dp[amount];
    }
};