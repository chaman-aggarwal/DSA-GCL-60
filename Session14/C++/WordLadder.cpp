https://leetcode.com/problems/word-ladder/

class Solution {
public:
    int ladderLength(string beginWord, string endWord, vector<string>& wordList) {
        
        unordered_set<string> wordSet(wordList.begin(), wordList.end());
        if(!wordSet.count(endWord)) {
            return 0;
        }
        
        queue<string> q;
        q.push(beginWord);
        int ladder = 0;
        
        while(!q.empty()) {
            ladder++;
            int levelSize = q.size();
            while(levelSize--) {
                string word = q.front(); 
                q.pop();
                for(int i=0; i<word.length(); i++) {
                    char originalChar = word[i];
                    for(char c='a'; c<='z'; c++) {
                        word[i] = c;
                        if(word==endWord) {
                            return ladder+1;
                        }
                        if(wordSet.count(word)>0) {
                            q.push(word);
                            wordSet.erase(word);
                        }
                    }
                    word[i] = originalChar;
                }  
            } 
        }
        return 0;
    }
};