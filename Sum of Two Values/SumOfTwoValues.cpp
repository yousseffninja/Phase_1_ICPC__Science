#include<bits/stdc++.h>
using namespace std;
int main(){
    int n, x, temp, tem;
    scanf("%d %d", &n, &x);
    int arr[n];
    map<int, int> m;
    for(int i=0; i<n; i++){
        scanf("%d", &arr[i]);
        m[arr[i]] = i+1;
    }
    for(int i=0; i<n;i++){
        temp = x - arr[i];
        if(m.count(temp) && m[temp] != i+1){
            cout << i+1 << " " << m[temp];
            return 0;
        }
    }
    cout << "IMPOSSIBLE";
    return 0;
}