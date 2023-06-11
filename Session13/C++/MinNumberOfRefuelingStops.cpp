https://leetcode.com/problems/minimum-number-of-refueling-stops/

class Solution {
public:
    int minRefuelStops(int target, int startFuel, vector<vector<int>>& stations) {
        
        int n=stations.size();
        priority_queue<int> pq;
        int maxDistCovered = startFuel;    
        int stops = 0, i = 0;

        while(maxDistCovered < target) {
            while(i < n && maxDistCovered >= stations[i][0]) {
                pq.push(stations[i][1]);   
                i++;
            }
            if(pq.empty()) {
                return -1;
            }
            maxDistCovered += pq.top();
            pq.pop();
            stops++;     
        }

        return stops;
    }
};