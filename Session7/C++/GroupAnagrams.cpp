https://leetcode.com/problems/group-anagrams/

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        
        unordered_map<string, vector<string>> anagramGroups;
        
        for(auto str:strs) {
            int charCount[26] = {0};
            for(char c:str) {
                charCount[c - 'a']++;
            }
            string key;
            for(int i=0; i<26; i++) {
                key += "#" + to_string(charCount[i]);
            }

            anagramGroups[key].push_back(str);
        }
        
        vector<vector<string>> result;
        for(auto group:anagramGroups) {
            result.push_back(group.second);
        }
        
        return result;
        
    }
};