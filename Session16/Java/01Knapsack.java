https://practice.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1

    static int[][] dp= new int[1000][1000];
    
    static int topDownKnapsack(int weights[], int values[], int n, int maxWeight) 
    { 
        if(n==0 || maxWeight==0) {
            return 0;
        }
        if(dp[n-1][maxWeight]!=-1) {
        
            return dp[n-1][maxWeight];
        }
        int include=0, exclude=0;
        if(weights[n-1]<=maxWeight) {
            include = values[n-1] + topDownKnapsack(weights, values, n-1, maxWeight-weights[n-1]);     
        }
        exclude = 0 + topDownKnapsack(weights, values, n-1, maxWeight);
        
        return dp[n-1][maxWeight] = Math.max(include, exclude); 
    }
    
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
        for (int[] row: dp)
            Arrays.fill(row, -1);
        return topDownKnapsack(wt, val, n, W);
    } 