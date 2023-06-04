https://leetcode.com/problems/binary-tree-right-side-view/

class Solution {
public:
    vector<int> rightSideView(TreeNode* root) {
        
        if(root==NULL)
        {
            return {};
        }
        
        queue<TreeNode*> q;
        q.push(root);
        vector<int> res;
        
        while(!q.empty())
        {
            int n = q.size();
            for(int i=1; i<=n; i++)
            {
                TreeNode* curr = q.front();
                q.pop();
                
                if(i==n)
                {
                    res.push_back(curr->val);
                }
                
                if(curr->left)
                {
                    q.push(curr->left);
                }
                if(curr->right)
                {
                    q.push(curr->right);
                }
            }
        }
        
        return res;
        
    }
};