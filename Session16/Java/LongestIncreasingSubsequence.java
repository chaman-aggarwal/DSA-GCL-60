https://leetcode.com/problems/longest-increasing-subsequence/

class Solution {
    
    int binarySearch(int s, int e, int[] dp, int val)
    {
        while(s<=e) {
            int mid = (s+e)/2;
            if(dp[mid]==val) {
                return mid;
            }
            else if(dp[mid] < val) {
                s = mid+1;
            }
            else {
                e = mid-1;
            }
        }
        return s;
    }
    
    public int lengthOfLIS(int[] nums) {
        
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        int len = 0;
        
        for(int i=1; i<n; i++) {
            if(nums[i] > dp[len]) {
                len++;
                dp[len] = nums[i];
            }
            else {
                int idx = binarySearch(0, len, dp, nums[i]);
                dp[idx] = nums[i];
            }
        }
        
        return len+1;   
    }
}