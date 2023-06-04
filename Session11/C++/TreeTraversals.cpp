https://leetcode.com/problems/binary-tree-preorder-traversal/

class Solution {
    
    void preorder(TreeNode* root, vector<int>&res)
    {
        // root, left, right
        if(root==NULL)
        {
            return;
        }
        res.push_back(root->val);
        preorder(root->left, res);
        preorder(root->right, res);
    }
    
public:
    vector<int> preorderTraversal(TreeNode* root) {
        
        vector<int> res;
        preorder(root, res);
        return res;
        
    }
};



https://leetcode.com/problems/binary-tree-inorder-traversal/

class Solution {
    
    void inorder(TreeNode* root, vector<int>&ans)
    {
        // left, root, right
        if(root==NULL)
        {
            return;
        }
        inorder(root->left, ans);
        ans.push_back(root->val);
        inorder(root->right, ans);
    }
    
public:
    vector<int> inorderTraversal(TreeNode* root) {
        
        vector<int> ans;
        inorder(root, ans);
        
        return ans;
        
    }
};



https://leetcode.com/problems/binary-tree-postorder-traversal/

class Solution {
    
    void postorder(TreeNode* root, vector<int>&ans)
    {
        // left, right, root
        if(root==NULL)
        {
            return;
        }
        postorder(root->left, ans);
        postorder(root->right, ans);
        ans.push_back(root->val);
    }
    
public:
    vector<int> postorderTraversal(TreeNode* root) {
        
        vector<int> ans;
        postorder(root, ans);
        return ans;
        
    }
};