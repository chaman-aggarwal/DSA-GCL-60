https://leetcode.com/problems/subarray-sum-equals-k/

class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int n = nums.length;
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, 1);
        int prefixSum = 0;
        int ans = 0;
        
        for(int i=0; i<n; i++)
        {
            prefixSum += nums[i];

            if(m.containsKey(prefixSum-k))
            {
                ans += m.get(prefixSum-k);
            }
            m.put(prefixSum, m.getOrDefault(prefixSum, 0)+1);
        }
        
        return ans;
        
    }
}