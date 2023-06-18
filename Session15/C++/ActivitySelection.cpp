https://practice.geeksforgeeks.org/problems/activity-selection-1587115620/1

    static bool compare(pair<int, int> a, pair<int, int> b)
    {
        return a.second < b.second;
    }
    public:
    //Function to find the maximum number of activities that can
    //be performed by a single person.
    int activitySelection(vector<int> start, vector<int> end, int n)
    {
        // Your code here
        vector<pair<int, int>> activities;
        for(int i=0; i<n; i++) {
            activities.push_back({start[i], end[i]});
        }
        
        sort(activities.begin(), activities.end(), compare);
        
        int maxActivities = 1;
        int finishTime = activities[0].second;
        
        for(int i=1; i<n; i++) {
            if(activities[i].first > finishTime) {
                finishTime = activities[i].second;
                maxActivities++;
            }
        }
        
        return maxActivities;
    }