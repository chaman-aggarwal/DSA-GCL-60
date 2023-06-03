https://practice.geeksforgeeks.org/problems/first-non-repeating-character-in-a-stream1216/1/?page=1&status[]=solved&category[]=Stack&category[]=Queue&sortBy=submissions#

		string FirstNonRepeating(string A){

        string ans = "";
        queue<char> q;
        unordered_map<char, int> freq;
        
        for(char c : A) {
            if(freq.count(c) == 0) {
                q.push(c);
            }
            freq[c]++;
            
            while(!q.empty() && freq[q.front()] > 1) {
                q.pop();
            }
            
            ans += (q.empty()) ? '#' : q.front();
        }
        return ans;
	}