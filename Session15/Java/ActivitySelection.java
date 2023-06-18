https://practice.geeksforgeeks.org/problems/activity-selection-1587115620/1

class Solution {
    
    private static class Activity {
        int start;
        int end;

        Activity(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static int activitySelection(int[] start, int[] end, int n) {
        List<Activity> activities = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            activities.add(new Activity(start[i], end[i]));
        }

        activities.sort(Comparator.comparingInt(a -> a.end));

        int maxActivities = 1;
        int finishTime = activities.get(0).end;

        for (int i = 1; i < n; i++) {
            if (activities.get(i).start > finishTime) {
                finishTime = activities.get(i).end;
                maxActivities++;
            }
        }

        return maxActivities;
    }
}