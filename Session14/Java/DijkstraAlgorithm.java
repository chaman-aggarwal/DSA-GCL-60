https://practice.geeksforgeeks.org/problems/implementing-dijkstra-set-1-adjacency-matrix/1

class Solution
{
    static class Pair {
        int weight;
        int node;

        public Pair(int weight, int node) {
            this.weight = weight;
            this.node = node;
        }
    }
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        // Write your code here
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.weight));
        // PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> (a.weight - b.weight));
        pq.add(new Pair(0, S));
        int[] distance = new int[V];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[S] = 0;

        while (!pq.isEmpty()) {
            int node = pq.peek().node;
            int weight = pq.peek().weight;
            pq.poll();

            for (ArrayList<Integer> nbr : adj.get(node)) {
                int adjNode = nbr.get(0);
                int adjWeight = nbr.get(1);
                if (distance[adjNode] > weight + adjWeight) {
                    distance[adjNode] = weight + adjWeight;
                    pq.add(new Pair(distance[adjNode], adjNode));
                }
            }
        }
        return distance;
    }
}