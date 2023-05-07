https://leetcode.com/problems/longest-palindromic-substring/

class Solution {

    private int maxLen = 1;
    private int startIndex = 0;

    private void longestPalindromicSubstring(int l, int r, String s) {
        int n = s.length();
        while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        int currLen = r - l - 1;
        if (currLen > maxLen) {
            maxLen = currLen;
            startIndex = l + 1;
        }
    }

    public String longestPalindrome(String s) {
        
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            // Odd length
            longestPalindromicSubstring(i, i, s);
            // Even length
            longestPalindromicSubstring(i, i + 1, s);
        }

        return s.substring(startIndex, startIndex + maxLen);
    }
}