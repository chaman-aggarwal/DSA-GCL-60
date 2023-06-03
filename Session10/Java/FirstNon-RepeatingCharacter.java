https://practice.geeksforgeeks.org/problems/first-non-repeating-character-in-a-stream1216/1/?page=1&status[]=solved&category[]=Stack&category[]=Queue&sortBy=submissions#

class Solution
{
    public String FirstNonRepeating(String A)
    {
        StringBuilder ans = new StringBuilder();
        Queue<Character> q = new LinkedList<>();
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : A.toCharArray()) {
            if (!freq.containsKey(c)) {
                q.add(c);
            }
            freq.put(c, freq.getOrDefault(c, 0) + 1);

            while (!q.isEmpty() && freq.get(q.peek()) > 1) {
                q.poll();
            }

            ans.append((q.isEmpty()) ? '#' : q.peek());
        }
        return ans.toString();
    }
}