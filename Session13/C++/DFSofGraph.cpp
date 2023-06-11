https://practice.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1

    void dfs(vector<int>& res, int node, vector<int>& visited, vector<int> adj[]) {
        visited[node] = true;
        res.push_back(node);
        for(int nbr:adj[node]) {
            if(!visited[nbr]) {
                dfs(res, nbr, visited, adj);
            }
        }
    }
    
  public:
    // Function to return a list containing the DFS traversal of the graph.
    vector<int> dfsOfGraph(int V, vector<int> adj[]) {

        vector<int> res;
        vector<int> visited(V, 0);
        
        dfs(res, 0, visited, adj);
        
        return res;
    }