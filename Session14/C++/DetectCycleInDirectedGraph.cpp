https://practice.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1/

bool checkCycle(int node, vector<int> adj[], vector<int>& visited, vector<int>& path) {
    visited[node] = 1;
    path[node] = 1;
    
    for(int nbr:adj[node]) {
        if(!visited[nbr]) {
            if(checkCycle(nbr, adj, visited, path)) {
                return true;
            }
        }
        else if(path[nbr]) {
            return true; // condition for cycle
        }
    }
    
    path[node] = 0;
    return false;
}

// Function to detect cycle in a directed graph.
bool isCyclic(int V, vector<int> adj[]) {
    // code here
    vector<int> visited(V, 0);
    vector<int> path(V, 0);
    
    for(int i=0; i<V; i++) {
        if(!visited[i]) {
            if(checkCycle(i, adj, visited, path)) {
                return true;
            }
        }
    }
    return false;
}