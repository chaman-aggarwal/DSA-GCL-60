https://leetcode.com/problems/kth-smallest-element-in-a-bst/

class Solution {
    
    private static int res;
    private static int count;

    private void inorderTrav(TreeNode root)
    {
        if(root==null) {
            return;
        }
        inorderTrav(root.left);
        count--;
        if(count==0) {
            res = root.val;
            return;
        }
        inorderTrav(root.right);
    }
    
    public int kthSmallest(TreeNode root, int k) {
        count = k;
        inorderTrav(root);
        return res;
    }
}