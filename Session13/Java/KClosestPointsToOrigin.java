https://leetcode.com/problems/k-closest-points-to-origin/

class Solution {
    public int[][] kClosest(int[][] points, int K) {
        
        PriorityQueue<int[]> heap = new PriorityQueue<>
            ((a, b) -> (b[0]*b[0] + b[1]*b[1] - (a[0]*a[0] + a[1]*a[1])));
        
        for (int [] point: points) {
            heap.add(point);
            if (heap.size() > K) {
                heap.poll();   
            }
        }
        
        int [][] result = new int[K][2];
        while (K-- > 0) {
            result[K] = heap.poll();
        } 
        return result;
    }
}