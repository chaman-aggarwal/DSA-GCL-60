https://leetcode.com/problems/valid-palindrome-ii/

class Solution {
    
    boolean deleteString(String s, int i, int j)
    {
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
    public boolean validPalindrome(String s) {
        
        int n = s.length();
        int i=0;
        int j=n-1;
        
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return deleteString(s, i+1, j) || deleteString(s, i, j-1);
            }
            i++;
            j--;
        }
        return true;
        
    }
}