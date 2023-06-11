https://leetcode.com/problems/kth-largest-element-in-an-array/

class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min heap
        
        for(int i:nums) {
            pq.offer(i);
            if(pq.size()>k) {
                pq.poll();
            }
        }
        
        return pq.peek();
    }
}