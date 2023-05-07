https://leetcode.com/problems/longest-palindromic-substring/

class Solution {  

    int maxLen = 1;
    int start = 0;

    void longestPalindromicSubstring(int l, int r, string &s)
    {
        int n = s.size();
        while(l>=0 && r<n && s[l]==s[r])
        {
            l--;
            r++;
        }
        int currLen = r-l-1;
        if(currLen > maxLen)
        {
            start = l+1;
            maxLen = currLen;
        }
    }

public:
    string longestPalindrome(string s) {

        int n = s.size();
        
        for(int i=0; i<n; i++)
        {
            // odd length
            longestPalindromicSubstring(i, i, s);
            // even length
            longestPalindromicSubstring(i, i+1, s);
        }
        return s.substr(start, maxLen);
        
    }
};