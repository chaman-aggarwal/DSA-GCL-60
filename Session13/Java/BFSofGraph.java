https://practice.geeksforgeeks.org/problems/bfs-traversal-of-graph/1

class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> res = new ArrayList<>(); 
        boolean vis[] = new boolean[V]; 
        Queue<Integer> q = new LinkedList<>();
        q.add(0); 
        vis[0] = true; 
        
        while (!q.isEmpty()) {
            int node = q.poll();
            res.add(node); 
            for(int it: adj.get(node)) {
                if(vis[it] == false) {
                    vis[it] = true; 
                    q.add(it); 
                } 
            }
        }
        
        return res; 
    }
}