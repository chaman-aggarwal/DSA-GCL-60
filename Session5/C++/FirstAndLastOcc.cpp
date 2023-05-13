#include<bits/stdc++.h>
using namespace std;

int first = -1;
int last = -1;

void findOcc(string str, int idx, char target) {
    // base case
    if (idx == str.length()) {
        cout << first << endl;
        cout << last << endl;
        return;
    }

    char currChar = str[idx];
    if (currChar == target) {
        if (first == -1) {
            first = idx;
            last = idx;
        } else {
            last = idx;
        }
    }
    
    findOcc(str, idx + 1, target);
}

int main(){
    string str = "geeks";
    findOcc(str, 0, 'e');
    return 0;
}