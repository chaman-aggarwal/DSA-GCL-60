https://practice.geeksforgeeks.org/problems/bfs-traversal-of-graph/1

vector<int> bfsOfGraph(int V, vector<int> adj[]) {
    
    vector<int> ans;
    vector<int> visited(V, 0);
    queue<int> q;
    q.push(0);
    visited[0] = 1;
    
    while(!q.empty()) {
        int node = q.front();
        q.pop();
        ans.push_back(node);
        for(int nbr:adj[node]) {
            if(!visited[nbr]) {
                q.push(nbr);
                visited[nbr] = 1;
            }
        }
    }
        
    return ans;
}