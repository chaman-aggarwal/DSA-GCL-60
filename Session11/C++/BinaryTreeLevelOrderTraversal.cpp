https://leetcode.com/problems/binary-tree-level-order-traversal/

class Solution {
public:
    vector<vector<int>> levelOrder(TreeNode* root) {
        
        if(root==NULL)
        {
            return {};
        }
        
        queue<TreeNode*> q;
        q.push(root);
        vector<vector<int>> res;
        
        while(!q.empty())
        {
            vector<int> level;
            
            int n=q.size();
            for(int i=0; i<n; i++)
            {
                TreeNode* f=q.front();
                q.pop();
                level.push_back(f->val);
                if(f->left)
                {
                    q.push(f->left);
                }
                if(f->right)
                {
                    q.push(f->right);
                }       
            }
            res.push_back(level);
        }
        
        return res;
        
    }
};