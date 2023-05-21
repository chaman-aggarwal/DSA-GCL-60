https://practice.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1#

class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        HashSet<Integer> hs = new HashSet<>();
        int prefixSum = 0;
        for(int i=0; i<n; i++)
        {
           prefixSum += arr[i];

           if(prefixSum == 0 || hs.contains(prefixSum))
           {
               return true;
           }
           
           hs.add(prefixSum);
        }
       
       return false;
    }
}