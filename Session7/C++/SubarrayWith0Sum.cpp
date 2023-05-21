https://practice.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1#

bool subArrayExists(int arr[], int n)
    {
        //Your code here
        unordered_set<int> s;
        int prefixSum = 0;
        
        for(int i=0; i<n; i++)
        {
            prefixSum += arr[i];
            if(prefixSum==0 || s.count(prefixSum)>0)
            {
                return true;
            }
            s.insert(prefixSum);
        }
        
        return false;
    }