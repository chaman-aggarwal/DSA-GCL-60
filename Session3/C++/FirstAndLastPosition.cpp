#include<iostream>
using namespace std;

void searchRange(int arr[], int n, int target) 
{    
    int s = 0;
    int e = n-1;
    int first = -1, last = -1;
        
    // first occurence
    while(s<=e)
    {
        int mid = (s+e)/2;
        if(arr[mid]==target)
        {
            first = mid;
            e = mid-1; // left half
        }
        else if(arr[mid] > target)
        {            
            e = mid-1;
        }
        else
        {
            s = mid+1;
        }
    }

    // if(first==-1) {
    //     cout<<-1<<-1<<" "
    // }
    
    s = 0;
    e = n-1;
    // last occurence
    while(s<=e)
    {
        int mid = (s+e)/2;
        if(arr[mid]==target)
        {
            last = mid;
            s = mid+1; // right half
        }
        else if(arr[mid] > target)
        {            
            e = mid-1;
        }
        else
        {
            s = mid+1;
        }
    }
    cout<<first<<" "<<last;
}

int main(){
    int n, target;
    cin>>n>>target;
    int arr[n];
    for(int i=0; i<n; i++)
    {
        cin>>arr[i];
    }
    searchRange(arr, n, target);
    return 0;
}
    