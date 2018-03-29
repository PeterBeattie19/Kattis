#include <bits/stdc++.h>
using namespace std; 

#define rep(i,a,b) for(int i = a; i<b; i++)

char arr[101][101];
bool visited[101][101]; 



void dfs(int i, int j, int m, int n){
    //cout << "EXEX"<<endl;
    if(i < 0 || j < 0 || i >= m || j>=n || arr[i][j]=='#' || visited[i][j]==true)
        return; 

    visited[i][j] = true; 

    dfs(i+1,j,m,n);
    dfs(i,j+1,m,n); 
    dfs(i-1,j,m,n); 
    dfs(i,j-1,m,n); 
}

int main(){
    ios::sync_with_stdio(0);
    cin.tie(0);
    int c = 1;

    int i,j,m,n;
    
    

    while(scanf("%d %d",&m,&n)==2){ 

    rep(i,0,m){
        scanf("%s",&arr[i]); 
    }
  int count = 0; 
  
  

    for(int x = 0; x<m; x++){
        for(int y = 0; y<n; y++){
            if(arr[x][y] == '-' && visited[x][y]==false){
              //cout << count << endl;
                count++; 
                dfs(x,y,m,n); 
            }
        }
    }

    rep(i,0,101){
        rep(j,0,101){
            visited[i][j] = false; 
        }
    }

    cout << "Case " << c << ": " <<  count << endl; 
    c++;


}

    return 0; 
}
