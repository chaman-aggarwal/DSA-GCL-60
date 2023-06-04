https://leetcode.com/problems/maximum-depth-of-binary-tree/

class Solution {
    public int maxDepth(TreeNode root) {
        
        if(root==null)
        {
            return 0;
        }
        
        int ls = maxDepth(root.left);
        int rs = maxDepth(root.right);
        
        return Math.max(ls, rs)+1;
        
    }
}