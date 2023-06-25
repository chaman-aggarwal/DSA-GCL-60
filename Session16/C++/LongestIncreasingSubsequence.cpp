https://leetcode.com/problems/longest-increasing-subsequence/

class Solution {
    
    int binarySearch(int s, int e, vector<int>&dp, int target)
    {
        while(s<=e) {
            int mid = (s+e)/2;
            if(dp[mid]==target) {
                return mid;
            }
            else if(dp[mid] < target) {
                s = mid+1;
            }
            else {
                e = mid-1;
            }
        }
        return s;
    }
    
public:
    int lengthOfLIS(vector<int>& nums) {
    
        int n = nums.size();
        vector<int> dp;
        dp.push_back(nums[0]);
        
        for(int i=1; i<n; i++) {
            if(nums[i] > dp.back()) {
                dp.push_back(nums[i]);
            }
            else {
                int idx = binarySearch(0, dp.size()-1, dp, nums[i]);
                dp[idx] = nums[i]; // replacing
            }
        }
        
        return dp.size();
    }
};

// N * N

// int n = nums.size();
//         vector<int> dp(n, 1);
//         int lis = 1;
        
//         for(int i=1; i<n; i++)
//         {
//             for(int j=0; j<i; j++)
//             {
//                 if(nums[j] < nums[i])
//                 {
//                     dp[i] = max(dp[i], dp[j]+1);
//                     lis = max(lis, dp[i]);
//                 }
//             }
//         }
        
//         return lis;