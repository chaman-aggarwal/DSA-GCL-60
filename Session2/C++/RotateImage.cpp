#include<iostream>
using namespace std;

int main(){
    
    int n;
    cin>>n;
    int matrix[n][n];
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<n; j++)
        {
            cin>>matrix[i][j];
        }
    }

    // transpose
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<i; j++)
        {
            swap(matrix[i][j], matrix[j][i]);
        }
    }
    
    // reverse
    for(int i=0; i<n; i++)
    {
        int s=0;
        int e=n-1;
        while(s<e)
        {
            swap(matrix[i][s], matrix[i][e]);
            s++;
            e--;
        }
    }

    for(int i=0; i<n; i++)
    {
        for(int j=0; j<n; j++)
        {
            cout<<matrix[i][j]<<" ";
        }
        cout<<endl;
    }

    return 0;
}