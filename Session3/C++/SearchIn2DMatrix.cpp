#include<iostream>
using namespace std;

int main(){
    
    int n,m,target;
    cin>>n>>m>>target;
    int matrix[n][m];
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<m; j++)
        {
            cin>>matrix[i][j];
        }
    }

    int s = 0;
    int e = n*m-1;
    bool isPresent = false;
    while(s<=e)
    {
        int mid = (s+e)/2;
        int row = mid/m;
        int col = mid%m;
        
        if(matrix[row][col]==target)
        {
            isPresent = true;
            break;
        }
        else if(matrix[row][col] < target)
        {
            s = mid+1; // right
        }
        else
        {
            e = mid-1; // left
        }
    }
    if(isPresent==true)
    {
        cout<<"True";
    }
    else
    {
        cout<<"False";
    }
    return 0;
}