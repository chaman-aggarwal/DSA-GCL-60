https://practice.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1

class Solution {
    
    public void dfs(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> res) {
        res.add(node); 
        vis[node] = true; 
        for(Integer it: adj.get(node)) {
            if(vis[it] == false) {
                dfs(it, vis, adj, res); 
            }
        }
    }
    
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        
        ArrayList<Integer> res = new ArrayList<>(); 
        boolean vis[] = new boolean[V]; 
        
        dfs(0, vis, adj, res); 
        
        return res;
    }
}