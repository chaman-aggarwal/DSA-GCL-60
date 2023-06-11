https://practice.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1

    long long minCost(long long arr[], long long n) {
        // Your code here
        priority_queue<long, vector<long>, greater<long>> pq(arr, arr+n); // minHeap
        long long cost = 0;
        
        while(pq.size()>1) {
            long rope1 = pq.top();
            pq.pop();
            long rope2 = pq.top();
            pq.pop();
            
            cost += (rope1+rope2);
            pq.push(rope1+rope2);
        }
        
        return cost;
    }