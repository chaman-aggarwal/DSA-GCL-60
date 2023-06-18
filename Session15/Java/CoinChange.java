https://leetcode.com/problems/coin-change/

class Solution {
    public int coinChange(int[] coins, int amount) {
        
      	Arrays.sort(coins);
	    int[] dp = new int[amount+1];
	    Arrays.fill(dp, amount+1);
	    dp[0] = 0;
	    
	    for(int i=1; i<=amount; i++) {
	        for(int coin:coins) {
	            if(coin <= i) {
	                dp[i] = Math.min(dp[i], dp[i-coin]+1);
	            }
	            else {
	                break;
	            }
	        }
	    }
	    
	    return dp[amount]==amount+1 ? -1 : dp[amount];
    }
}