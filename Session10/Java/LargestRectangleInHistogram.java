https://leetcode.com/problems/largest-rectangle-in-histogram/

class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> stack = new Stack<>();
        int n = heights.length;
        int currArea = 0;
        int maxArea = 0;
        int i = 0;
        
        if (n == 0) {
            return 0;
        }
        
        while (i < n) {
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                int top = stack.pop();
                currArea = heights[top] * (stack.isEmpty() ? i : i - stack.peek() - 1);
                maxArea = Math.max(currArea, maxArea);
            }
            stack.push(i++);
        }
        
        while (!stack.isEmpty()) {
            int top = stack.pop();
            currArea = heights[top] * (stack.isEmpty() ? i : i - stack.peek() - 1);
            maxArea = Math.max(currArea, maxArea);
        }
        
        return maxArea;
        
    }
}