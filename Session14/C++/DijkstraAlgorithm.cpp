https://practice.geeksforgeeks.org/problems/implementing-dijkstra-set-1-adjacency-matrix/1

    vector <int> dijkstra(int V, vector<vector<int>> adj[], int S)
    {
        priority_queue<pair<int, int>, vector<pair<int, int>>, greater<pair<int, int>>> pq; // min heap
        // distance, node
        pq.push({0, S});
        vector<int> distance(V, INT_MAX);
        distance[S] = 0;
    
        while (!pq.empty()) {
            int node = pq.top().second;
            int weight = pq.top().first;
            pq.pop();
            
            for (auto nbr : adj[node]) {
                int adjNode = nbr[0];
                int adjWeight = nbr[1];
                if (distance[adjNode] > weight + adjWeight) {
                    distance[adjNode] = weight + adjWeight;
                    pq.push({distance[adjNode], adjNode});
                }
            }
        }
        return distance;
    }