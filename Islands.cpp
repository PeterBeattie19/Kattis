#include <bits/stdc++.h>
using namespace std; 

#define rep(i,a,b) for(int i = a; i<b; i++)

char arr[101][101];
bool visited[101][101]; 



void dfs(int i, int j, int m, int n){
    if(!(i < 0 || j < 0 || i >= m || j>=n || arr[i][j]=='W' || visited[i][j]==true)){

        //cout << i << j << endl; 
        visited[i][j] = true; 

        dfs(i+1,j,m,n);
        dfs(i,j+1,m,n); 
        dfs(i-1,j,m,n); 
        dfs(i,j-1,m,n); 
    }
}

int main(){
    ios::sync_with_stdio(0);
    cin.tie(0);

    int i,j,m,n;
    
   cin >> n >> m;  



    rep(i,0,n){
        //scanf("%s",&arr[i]); 
        cin >> arr[i]; 
    }
    int count = 0; 



    for(int x = 0; x<n; x++){
        for(int y = 0; y<m; y++){
            if(arr[x][y] == 'L' && visited[x][y]==false){
                //cout <<"METHOD CALL " << x << y << endl; 
                count++; 
                dfs(x,y,n,m); 
            }
        }
    }



   cout << count; 

    return 0; 
}
