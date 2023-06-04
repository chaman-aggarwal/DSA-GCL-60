https://practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1

class Solution
{
    static class Pair
    {
        Node node;
        int hd;
        Pair(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        ArrayList<Integer> ans = new ArrayList<>(); 
        if(root == null) return ans;
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(root, 0)); 
        
        while(!q.isEmpty()) {
            Pair pair = q.remove();
            int hd = pair.hd; 
            Node node = pair.node; 
            if(map.get(hd) == null)
            {
                map.put(hd, node.data);    
            } 
            if(node.left != null) {
                
                q.add(new Pair(node.left, hd - 1)); 
            }
            if(node.right != null) {
                
                q.add(new Pair(node.right, hd + 1)); 
            }
        }
    
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            ans.add(entry.getValue()); 
        }
        return ans; 
    }
}