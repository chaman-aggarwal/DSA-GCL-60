https://leetcode.com/problems/binary-tree-maximum-path-sum/

class Solution {
    
    int findSum(TreeNode* root, int& res)
    {
        if(root==NULL)
        {
            return 0;
        }
        
        int leftSum = max(0, findSum(root->left, res));
        int rightSum = max(0, findSum(root->right, res));
        
        res = max(res, root->val + leftSum + rightSum);
        
        return root->val + max(leftSum, rightSum);
    }
    
public:
    int maxPathSum(TreeNode* root) {
        
        int res = INT_MIN;
        findSum(root, res);
        return res;
        
    }
};