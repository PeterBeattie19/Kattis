#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
#define endl "\n"
#define rep(i,a,b) for(int i = a; i<b; i++)

int main(){
    ios::sync_with_stdio(0);
    cin.tie(0);
    
    int i,j,k;

    int n; 
    cin >> n; 

    vector<int> a; 
    rep(i, 0, n){
        cin >> j; 
        a.push_back(j); 
    }


    int c = 0; 

    while(true){
        int h = a[0]; 
        i = 0; 
        vector<int> b; 
        while(i < a.size()){
            if(h == a[i])
                h -= 1; 
            else
                b.push_back(a[i]); 
            i += 1; 
        }
        c += 1; 

        if(b.size() == 0)
            break; 

        a = b; 
    }    
    
    cout << c << endl; 
    return 0;
}