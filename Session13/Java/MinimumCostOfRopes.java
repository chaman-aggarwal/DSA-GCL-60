https://practice.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1

class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) {
        // your code here
        PriorityQueue<Long> queue = new PriorityQueue<>();
        for(long i : arr) {
            queue.add(i);
        }
        long cost = 0;
        while(queue.size() > 1) {
            long rope1 = queue.poll();
            long rope2 = queue.poll();
            cost += rope1 + rope2;
            queue.add(rope1 + rope2);
        }
        return cost;
    }
}