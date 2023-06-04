https://practice.geeksforgeeks.org/problems/transform-to-sum-tree/1

class Solution{
    
    int replaceSum(Node root) {
        if(root==null) {
            return 0;
        }
        if(root.left==null && root.right==null) {
            int temp = root.data;
            root.data = 0;
            return temp;
        }
        int leftSum = replaceSum(root.left);
        int rightSum = replaceSum(root.right);
        
        int temp = root.data;
        root.data = leftSum + rightSum;
        return root.data + temp;
    }
    
    public void toSumTree(Node root){
         //add code here.
        replaceSum(root);
    }
}