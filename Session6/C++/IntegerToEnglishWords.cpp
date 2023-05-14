https://leetcode.com/problems/integer-to-english-words/

class Solution {
    
    vector<string> BELOW_20 = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
        "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    vector<string> TENS = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    vector<string> THOUSANDS = {"", "Thousand", "Million", "Billion"};

    string helper(int num) {
        if (num == 0) {
            return "";
        } else if (num < 20) {
            return BELOW_20[num] + " "; 
        } else if (num < 100) {
            return TENS[num / 10] + " " + helper(num % 10); 
        } else {
            return BELOW_20[num / 100] + " Hundred " + helper(num % 100);
        }
    }

    
public:
    string numberToWords(int num) {

        if (num == 0) {
            return "Zero";
        }

        string words;
        int group = 0;

        while (num > 0) {
            if (num % 1000 != 0) {
                words = helper(num % 1000) + THOUSANDS[group] + " " + words;
            }
            num /= 1000;
            group++;
        }

        while(words.back()==' ') {
            words.pop_back();
        }

        return words;

    }
};