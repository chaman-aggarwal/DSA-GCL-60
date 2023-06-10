https://leetcode.com/problems/binary-tree-maximum-path-sum/

class Solution {
    
    int res = Integer.MIN_VALUE;
    
    int findSum(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        
        int leftSum = Math.max(0, findSum(root.left));
        int rightSum = Math.max(0, findSum(root.right));
        
        res = Math.max(res, root.val + leftSum + rightSum);
        
        return root.val + Math.max(leftSum, rightSum);
    }
    
    public int maxPathSum(TreeNode root) {
        
        findSum(root);
        return res;
        
    }
}