https://leetcode.com/problems/word-ladder/

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        HashSet<String> wordSet = new HashSet<>(wordList);
        if(!wordSet.contains(endWord)) {
            return 0;
        }
        
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int ladder = 0; 
        while(queue.size()>0) {
            ladder++; 
            int levelSize = queue.size();
            while(levelSize>0) {
                char[] word = queue.poll().toCharArray();
                for(int i=0; i<word.length; i++) {
                    char originalChar = word[i];
                    for(char c='a'; c<='z'; c++) {
                        word[i] = c;
                        String newWord = new String(word); 
                        if(newWord.equals(endWord)) {
                            return ladder+1;
                        }
                        if(wordSet.contains(newWord)) {    
                            queue.add(newWord);
                            wordSet.remove(newWord);
                        }
                    }
                    word[i] = originalChar;
                }
                levelSize--;
            }
        }
        return 0;
    }
}