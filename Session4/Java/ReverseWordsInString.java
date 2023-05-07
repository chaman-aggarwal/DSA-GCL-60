https://leetcode.com/problems/reverse-words-in-a-string-iii/

class Solution {
    
    void reverse_str(char[] s, int start, int end)
    {
        while(start<end)
        {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
    
    public String reverseWords(String s) {
        
        char[] c = s.toCharArray();
        int i=0;
        for(int j=0; j<c.length; j++)
        {
            if(c[j]==' ')
            {
                reverse_str(c, i, j-1);
                i = j+1;
            }
        }
        
        reverse_str(c, i, c.length-1);
        
        return new String(c);
        
    }
}