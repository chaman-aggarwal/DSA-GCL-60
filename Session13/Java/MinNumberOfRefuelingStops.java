https://leetcode.com/problems/minimum-number-of-refueling-stops/

class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        
        int n=stations.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int maxDistCovered = startFuel;    
        int stops = 0, i = 0;

        while(maxDistCovered < target) {
            while(i < n && maxDistCovered >= stations[i][0]) {
                pq.offer(stations[i][1]);   
                i++;
            }
            if(pq.isEmpty()) {
                return -1;
            }
            maxDistCovered += pq.poll();
            stops++;     
        }

        return stops;
    }
}