https://leetcode.com/problems/kth-smallest-element-in-a-bst/

class Solution { 
    int res;
    
    void inorderTrav(TreeNode* root, int &k)
    {
        if(root==NULL) {
            return;
        }
        inorderTrav(root->left, k);
        k--;
        if(k==0) {
            res = root->val;
            return;
        }
        inorderTrav(root->right, k);
    }
    
public:
    int kthSmallest(TreeNode* root, int k) {
        
        inorderTrav(root, k);
        return res;
    }
};