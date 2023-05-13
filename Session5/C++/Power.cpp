#include<bits/stdc++.h>
using namespace std;

// a = 5, b = 3
// 5 * power(5, 2) -> 25 = 125;
// 5 * power(5, 1)-> 5 = 25;
// 5 * power(5, 0) -> 1 = 5;

int power(int a, int b)
{
    // base case
    if(b==0){
        return 1;
    }
    return a*power(a, b-1);
}

int main(){
    int a,b;
    cin>>a>>b;
    cout<<power(a,b);
    return 0;
}