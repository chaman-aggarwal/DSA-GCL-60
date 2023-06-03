https://leetcode.com/problems/asteroid-collision/

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> stack = new Stack<>();
        for (int i : asteroids) {
            if (stack.isEmpty() || i > 0 || stack.peek() < 0) {
                stack.push(i);
            } else {
                boolean destroyed = false;
                while (!stack.isEmpty() && stack.peek() > 0 && !destroyed) {
                    int top = stack.peek();
                    if (Math.abs(i) > top) {
                        stack.pop();
                    } else if (Math.abs(i) < top) {
                        destroyed = true;
                    } else {
                        stack.pop();
                        destroyed = true;
                    }
                }
                if (!destroyed) {
                    stack.push(i);
                }
            }
        }
        
        int[] result = new int[stack.size()];
        int index = stack.size() - 1;
        while (!stack.isEmpty()) {
            result[index--] = stack.pop();
        }

        return result;
        
    }
}