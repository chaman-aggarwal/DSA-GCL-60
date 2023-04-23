#include<iostream>
using namespace std;

int maximumProduct(int nums[], int n)
{
    int min1 = INT_MAX, min2 = INT_MAX;
    int max1 = INT_MIN, max2 = INT_MIN, max3 = INT_MIN;
    
    for(int i=0; i<n; i++)
    {
        if(nums[i] <= min1)
        {
            min2 = min1;
            min1 = nums[i];
        }
        else if(nums[i] < min2)
        {
            min2 = nums[i];
        }
        
        if(nums[i] >= max1)
        {
            max3 = max2;
            max2 = max1;
            max1 = nums[i];
        }
        else if(nums[i] >= max2)
        {
            max3 = max2;
            max2 = nums[i];
        }
        else if(nums[i] > max3)
        {
            max3 = nums[i];
        }
    }
    int op1 = max1 * max2 * max3;
    int op2 = min1 * min2 * max1;
    return max(op1, op2);
}

int main(){

    int n;
    cin>>n;
    int arr[n];
    for(int i=0; i<n; i++)
    {
        cin>>arr[i];
    }

    cout<<maximumProduct(arr, n);

    return 0;
}