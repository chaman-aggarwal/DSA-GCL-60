https://practice.geeksforgeeks.org/problems/transform-to-sum-tree/1

class Solution {
    
    int replaceSum(Node* root)
    {
        if(root==NULL) {
            return 0;
        }
        // leaf node
        if(!root->left && !root->right) {
            int temp = root->data;
            root->data = 0;
            return temp;
        }
        int leftSum = replaceSum(root->left);
        int rightSum = replaceSum(root->right);
        
        int temp = root->data;
        root->data = leftSum + rightSum;
        return root->data + temp;
    }
    
  public:
  
    // Convert a given tree to a tree where every node contains sum of values of
    // nodes in left and right subtrees in the original tree
    void toSumTree(Node *node)
    {
        // Your code here
        replaceSum(node);
    }
};