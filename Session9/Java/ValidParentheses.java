https://leetcode.com/problems/valid-parentheses/

class Solution {

    private boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') || (open == '{' && close == '}') 
            || (open == '[' && close == ']');
    }

    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (!stack.isEmpty() && isMatchingPair(stack.peek(), c)) {
                stack.pop();
            } else {
                return false;
            }
        }
        
        return stack.isEmpty();
        
    }
}