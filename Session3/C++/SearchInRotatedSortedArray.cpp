#include<iostream>
using namespace std;

int search(int arr[], int n, int target) 
{        
    int s = 0;
    int e = n-1;
    
    while(s<=e)
    {
        int mid = (s+e)/2;
        if(arr[mid]==target)
        {
            return mid;
        }
        // left half is sorted
        else if(arr[s]<=arr[mid]) { 
            if(arr[s] <= target && target <= arr[mid]) { 
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        // right half is sorted
        else{
            if(arr[mid] <= target && target <= arr[e]){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
    }
    return -1;
}

int main(){
    int n, target;
    cin>>n>>target;
    int arr[n];
    for(int i=0; i<n; i++)
    {
        cin>>arr[i];
    }
    cout<<search(arr, n, target);
    return 0;
}