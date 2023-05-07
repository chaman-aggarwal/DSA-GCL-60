#include<bits/stdc++.h>
using namespace std;

int binarySearch(int arr[], int target, int n)
{
    int s=0;
    int e=n-1;
    while(s<=e)
    {
        int mid = (s+e)/2;
        if(arr[mid]==target)
        {
            return mid;
        }
        else if(arr[mid] < target)
        {
            s = mid+1; // right
        }
        else
        {
            e = mid-1; // left
        }
    }
    return -1;
}

int main(){
    int n;
    cin>>n;
    int target;
    cin>>target;
    int arr[n];
    for(int i=0; i<n; i++)
    {
        cin>>arr[i];
    }
    cout<<binarySearch(arr, target, n);
    return 0;
}