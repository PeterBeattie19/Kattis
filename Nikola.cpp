#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
#define endl "\n"
#define rep(i,a,b) for(int i = a; i<b; i++)

int best = 1000000000; 

inline int solve(vector<int> a, int last_jump, int cost, int pos){
    if(pos < 0 || pos >= a.size())
        return  1000000000; 

    if(pos == a.size()-1){
        int ans = cost + a[pos]; 
        if(ans < best)
            best = ans; 
        return ans; 
    }

    return min(solve(a, last_jump, cost+a[pos], pos-last_jump), solve(a, last_jump+1, cost+a[pos], pos + last_jump + 1)); 
}

    int main(){
    ios::sync_with_stdio(0);
    cin.tie(0);
    
    int n, i, j;
    cin >> n; 

    vector<int> v; 

    rep(i, 0, n){
       cin >> j; 
       v.push_back(j);  
    }
        

    cout << solve(v, 1, 0, 1) << endl; 
    return 0;
}   