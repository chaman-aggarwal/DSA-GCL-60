https://leetcode.com/problems/gas-station/

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int n = gas.length;
        int balance = 0;
        int totalGas = 0;
        int startIndex = 0;
        
        for(int i=0; i<n; i++)
        {
            balance += gas[i] - cost[i];
            totalGas += gas[i] - cost[i];
            
            if(balance < 0)
            {
                startIndex= i+1;
                balance = 0;
            }
        }
        
        return totalGas >= 0 ? startIndex : -1;
        
    }
}