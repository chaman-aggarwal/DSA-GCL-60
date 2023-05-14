https://leetcode.com/problems/integer-to-english-words/

class Solution {

    private static final String[] BELOW_20 = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
        "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] TENS = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    private static final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};

    private static String helper(int num) {
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

    public String numberToWords(int num) {

        if (num == 0) {
            return "Zero";
        }

        StringBuilder words = new StringBuilder();
        int group = 0;

        while (num > 0) {
            if (num % 1000 != 0) {
                words.insert(0, helper(num % 1000) + THOUSANDS[group] + " ");
            }
            num /= 1000;
            group++;
        }

        return words.toString().trim();
    }
}