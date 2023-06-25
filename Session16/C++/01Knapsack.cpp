https://practice.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1

    int topDownKnapsack(int weights[], int values[], int n, int maxWeight, vector<vector<int>>& dp) {
        if(n==0 || maxWeight==0) {
            return 0;
        }
        if(dp[n-1][maxWeight]!=-1) {
        
            return dp[n-1][maxWeight];
        }
        int include=0, exclude=0;
        if(weights[n-1]<=maxWeight) {
            include = values[n-1] + topDownKnapsack(weights, values, n-1, maxWeight-weights[n-1], dp);     
        }
        exclude = 0 + topDownKnapsack(weights, values, n-1, maxWeight, dp);
        
        return dp[n-1][maxWeight] = max(include, exclude); 
    }
    
    public:
    //Function to return max value that can be put in knapsack of capacity W.
    int knapSack(int W, int wt[], int val[], int n) 
    { 
       // Your code here
        vector<vector<int>> dp(n, vector<int>(W+1, -1));
        return topDownKnapsack(wt, val, n, W, dp);
    }