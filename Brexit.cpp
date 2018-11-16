#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
#define endl "\n"
#define rep(i,a,b) for(int i = a; i<b; i++)

inline void solve(vector<set<int>>& graph, int cur, set<int>& left, vector<int>& original_sizes){
    if(left.count(cur) == 0 || graph[cur].size() <= original_sizes[cur]/2 || graph[cur].size() == 1){
        left.insert(cur); 
        for(auto &  i: graph[cur]){
            if(graph[i].count(cur) != 0)
                graph[i].erase(cur);
        }

        for(auto &i : graph[cur]){
            if(graph[i].size() <= original_sizes[i]/2 || graph[i].size() == 1)
                solve(graph, i, left, original_sizes); 
        }
    }
}


int main(){
    ios::sync_with_stdio(0);
    cin.tie(0);
    
    int i,j,k,a,b,c,p,x,L;
    
    cin >> c >> p >> x >> L; 

    x -= 1; L -= 1; 

    vector<set<int>> graph(c); 

    for(int e = 0; e<p; e++){
        cin >> a >> b;
        a -= 1; b -= 1;
        graph[a].insert(b); 
        graph[b].insert(a); 
    }

    vector<int> original_sizes; 

    rep(i, 0, c){
        original_sizes.push_back(graph[i].size()); 
    }

    set<int> left; 

    solve(graph, L, left, original_sizes);

    if(left.count(x) != 0)
        cout << "leave" << endl; 
    else
        cout << "stay" << endl; 

    return 0;
}