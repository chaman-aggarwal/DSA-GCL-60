https://leetcode.com/problems/evaluate-reverse-polish-notation/

class Solution {

    private int performOperation(String token, int y, int x) {
        if (token.equals("+")) {
            return y + x;
        } else if (token.equals("-")) {
            return y - x;
        } else if (token.equals("*")) {
            return y * x;
        } else {
            return y / x;
        }
    }

    public int evalRPN(String[] tokens) {
        
        Stack<Integer> s = new Stack<>();
        for(String token:tokens)
        {
            if("+-*/".contains(token)){
                int x = s.pop();
                int y = s.pop();
                s.push(performOperation(token, y, x));
            }
            else{
                s.push(Integer.parseInt(token));
            }
        }
        
        return s.peek();
        
    }
}