https://practice.geeksforgeeks.org/problems/topological-sort/1/

class Solution
{
    static void findTopoSort(int node, int vis[], ArrayList<ArrayList<Integer>> adj, Stack<Integer> st) 
    {
        vis[node] = 1; 
        for(Integer nbr: adj.get(node)) {
            if(vis[nbr] == 0) {
                findTopoSort(nbr, vis, adj, st); 
            } 
        }
        st.push(node); 
    }
    
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        Stack<Integer> st = new Stack<Integer>(); 
        int vis[] = new int[V]; 
        
        for(int i=0; i<V; i++) {
            if(vis[i] == 0) {
                findTopoSort(i, vis, adj, st);
            }
        }
        
        int res[] = new int[V];
        int ind = 0; 
        while(!st.isEmpty()) {
            res[ind++] = st.pop();
        }

        return res; 
    }
}