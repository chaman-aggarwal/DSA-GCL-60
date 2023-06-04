https://leetcode.com/problems/binary-tree-preorder-traversal/

class Solution {
    
    void preorder(TreeNode root, List<Integer> ans)
    {
        if(root==null)
        {
            return;
        }
        ans.add(root.val); 
        preorder(root.left, ans);
        preorder(root.right, ans);
    }
    
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> ans = new ArrayList<Integer>();
        
        preorder(root, ans);
        
        return ans;
        
    }
}



https://leetcode.com/problems/binary-tree-inorder-traversal/

class Solution {
    
    void inorder(TreeNode root, List<Integer> ans)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left, ans);
        ans.add(root.val);
        inorder(root.right, ans);
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> ans = new ArrayList<Integer>();
        
        inorder(root, ans);
        
        return ans;
        
    }
}



https://leetcode.com/problems/binary-tree-postorder-traversal/

class Solution {
    
    void postorder(TreeNode root, List<Integer> ans)
    {
        if(root==null)
        {
            return;
        }
        postorder(root.left, ans);
        postorder(root.right, ans);
        ans.add(root.val);
    }
    
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> ans = new ArrayList<Integer>();
        
        postorder(root, ans);
        
        return ans;
        
    }
}
