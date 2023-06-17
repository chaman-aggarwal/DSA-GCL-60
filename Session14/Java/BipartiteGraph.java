https://leetcode.com/problems/is-graph-bipartite/

class Solution {
    public boolean isBipartite(int[][] graph) {
        
        int len = graph.length;
        int[] colors = new int[len];
        
        for (int i=0; i<len; i++) {
            if (colors[i] == 0) {
                Queue<Integer> queue = new LinkedList<>();
                queue.add(i);
                colors[i] = 1;  
                while (!queue.isEmpty()) {
                    int node = queue.poll();
                    for (int nbr : graph[node]) {
                        // uncolored
                        if (colors[nbr] == 0) {          
                            colors[nbr] = -colors[node];  
                            queue.add(nbr);
                        } 
                        // same color
                        if(colors[nbr] == colors[node]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}