https://practice.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1/

class Solution {
    
    boolean checkCycle(int node,  ArrayList<ArrayList<Integer>> adj, int vis[], int path[]) {
        vis[node] = 1; 
        path[node] = 1; 
        
        for(Integer nbr: adj.get(node)) {
            if(vis[nbr] == 0) {
                if(checkCycle(nbr, adj, vis, path) == true) {
                    return true; 
                }
            } 
            else if(path[nbr] == 1) {
                return true; 
            }
        }
        path[node] = 0;
        return false; 
    }
    
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        int vis[] = new int[V]; 
        int path[] = new int[V]; 
        
        for(int i=0; i<V; i++) {
            if(vis[i] == 0) {
                if(checkCycle(i, adj, vis, path) == true){
                    return true;    
                }
            }
        }
        return false; 
    }
}