https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        // searching
        if(root==null || root==p || root==q) {
            return root;
        }
        
        TreeNode leftLca = lowestCommonAncestor(root.left, p, q);
        TreeNode rightLca = lowestCommonAncestor(root.right, p, q);
        
        // condition for lca
        if(leftLca!=null && rightLca!=null) {
            return root;
        }
        
        return leftLca!=null ? leftLca : rightLca;   
    }
}