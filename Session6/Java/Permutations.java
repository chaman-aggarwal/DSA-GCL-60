https://leetcode.com/problems/permutations/

class Solution {

    private void swap(int[] nums, int i, int j) 
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void generatePermutations(int[] nums, int i, List<List<Integer>> res)
    {
        if(i==nums.length){
            List<Integer> subList = new ArrayList<Integer>();
            for(int num : nums)
            {
	            subList.add(num);
	        }
            res.add(subList);
            return;
        }
        
        for(int j=i; j<nums.length; j++){
            swap(nums, i, j);
            generatePermutations(nums, i+1, res);
            // backtracking, to restore original array back
            swap(nums, i, j);
        }
        
    }
    
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> res=new ArrayList<>();
        generatePermutations(nums, 0, res);
        
        return res;
        
    }
}