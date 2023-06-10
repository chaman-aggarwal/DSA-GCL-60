https://leetcode.com/problems/delete-node-in-a-bst/

class Solution {

    TreeNode* getMinValueNode(TreeNode* node) {
        while(node->left!=NULL) {
            node = node->left;
        }
        return node;
    }

public:
    TreeNode* deleteNode(TreeNode* root, int key) {
        
        if(root==NULL) {
            return NULL;
        }
        else if(root->val > key) {
            root->left = deleteNode(root->left, key);
        }
        else if(root->val < key) {
            root->right = deleteNode(root->right, key);
        }
        // root->val == key
        else {
            // leaf node
            if(!root->left && !root->right) {
                return NULL;
            }
            // 1 child
            else if(!root->left || !root->right) {
                return root->left ? root->left : root->right;
            }
            // 2 children
            TreeNode* replace = getMinValueNode(root->right);
            root->val = replace->val;
            root->right = deleteNode(root->right, replace->val);
        }
        return root;
    }
};