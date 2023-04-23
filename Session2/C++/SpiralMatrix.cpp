#include<iostream>
using namespace std;

int main(){
    
    int n,m;
    cin>>n>>m;
    int matrix[n][m];
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<m; j++)
        {
            cin>>matrix[i][j];
        }
    }

    int sr = 0;
    int sc = 0;
    int er = n-1;
    int ec = m-1;
    
    while(sr<=er && sc<=ec)
    {
        for(int i=sc; i<=ec; i++)
        {
            cout<<matrix[sr][i]<<" ";
        }
        sr++;
        
        for(int i=sr; i<=er; i++)
        {
            cout<<matrix[i][ec]<<" ";
        }
        ec--;
        
        if(sr<=er)
        {
            for(int i=ec; i>=sc; i--)
            {
                cout<<matrix[er][i]<<" ";
            }
        }
        er--;
        
        if(sc<=ec)
        {
            for(int i=er; i>=sr; i--)
            {
                cout<<matrix[i][sc]<<" ";
            }
        }
        sc++;
    }
    return 0;
}