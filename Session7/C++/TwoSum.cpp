https://leetcode.com/problems/two-sum/

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        
        unordered_map<int, int> m;
        int n = nums.size();
        
        for(int i=0; i<n; i++)
        {
            int diff = target - nums[i];
            if(m.count(diff) > 0)
            {
                return {i, m[diff]};
            }
            m[nums[i]] = i;
        }
        
        return {};
        
    }
};