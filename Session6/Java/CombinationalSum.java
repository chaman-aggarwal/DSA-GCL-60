https://leetcode.com/problems/combination-sum/

class Solution {
    
    void allCombinations(int[] candidates, int index, int target, List<Integer> path, List<List<Integer>> res)
    {
        if(index==candidates.length){
            return;
        }
        
        if(target==0){
            res.add(new ArrayList(path));
            return;
        }
        
        // include
        if(candidates[index]<=target){
            path.add(candidates[index]);
            allCombinations(candidates, index, target-candidates[index], path, res);
            path.remove(path.size()-1);
        }
        
        //exclude
        allCombinations(candidates, index+1, target, path, res);
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> res=new ArrayList<>();
        allCombinations(candidates, 0, target, new ArrayList<>(), res);
        
        return res;
    }
}