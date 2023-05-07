https://leetcode.com/problems/reverse-words-in-a-string-iii/

class Solution {
    
    void reverse_str(string &s, int start, int end)
    {
        while(start<end)
        {
            swap(s[start], s[end]);
            start++;
            end--;
        }
    }
    
public:
    string reverseWords(string s) {
        
        int i=0;
        for(int j=0; j<s.length(); j++)
        {
            if(s[j]==' ')
            {
                reverse_str(s, i, j-1);
                i = j+1;
            }
        }
        
        reverse_str(s, i, s.size()-1);
        
        return s;
        
    }
};