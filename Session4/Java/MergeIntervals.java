https://leetcode.com/problems/merge-intervals/

class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        List<int[]> result = new ArrayList<>();

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        int s1 = intervals[0][0];
        int e1 = intervals[0][1];

        for (int i = 1; i < n; i++) {
            int s2 = intervals[i][0];
            int e2 = intervals[i][1];

            // overlapping
            if (s2 <= e1) {
                e1 = Math.max(e1, e2);
            }
            // non-overlapping
            else {
                result.add(new int[]{s1, e1});
                s1 = s2;
                e1 = e2;
            }
        }

        result.add(new int[]{s1, e1});
        
        return result.toArray(new int[result.size()][]);
    }
}