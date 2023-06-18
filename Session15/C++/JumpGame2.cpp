https://leetcode.com/problems/jump-game-ii/

class Solution {
public:
    int jump(vector<int>& nums) {
        
        int n = nums.size();
        int jumps = 0;
        int farthest = 0;
        int currReach = 0;
        
        for(int i=0; i<n-1; i++) {
            farthest = max(farthest, i+nums[i]);
            if(i == currReach) {        // Visited all the items on the current level
                jumps++;                // Increment the level
                currReach = farthest;   // Make the queue size for the next level
            }
        }
        
        return jumps;
    }
};