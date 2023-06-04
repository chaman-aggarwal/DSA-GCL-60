https://leetcode.com/problems/binary-tree-level-order-traversal/

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
       
       if(root == null)
       {
          return result;
       }
       
       Queue<TreeNode> queue = new LinkedList<TreeNode>();
       queue.add(root);
       
       int n = 0;
       while(!queue.isEmpty())
       {
           List<Integer> level = new ArrayList<Integer>(); 
           n = queue.size();
           for(int i=0;i<n;i++)
           {
               TreeNode f = queue.poll();
               level.add(f.val);
               if(f.left!=null)
               {
                   queue.add(f.left);
               }
               if(f.right!=null)
               {
                   queue.add(f.right);
               }
           }
           result.add(level);
       }
       
       return result;
        
    }
}