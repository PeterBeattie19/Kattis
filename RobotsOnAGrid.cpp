#include <bits/stdc++.h>
using namespace std; 

#define rep(i,a,b) for(int i = a; i<b; i++)

char grid[2005][2005]; 
long long memo[2005][2005]; 
bool visited[2005][2005]; 
long long m = 2147483647; 

long long count(int x, int y, int n){

	if( !(x<0 || x>=n || y<0 || y>=n) && grid[x][y] != '#'){


		//cout << x << " " << y << endl;
		if(memo[x][y] != -1){
			return memo[x][y]; 
		}

		memo[x][y] = (count(x+1, y, n) + count(x,y+1,n))%m; 
		return memo[x][y]; 

	}

	return 0; 

}

long long reCount(int x, int y, int n){

	if( !(x<0 || x>=n || y<0 || y>=n) && grid[x][y] != '#' && visited[x][y] == false){

		visited[x][y] = true; 

		//cout << x << " " << y << endl;
		if(memo[x][y] != -1){
			visited[x][y] = false; 
			return memo[x][y]; 
		}

		memo[x][y] = (reCount(x+1, y, n) + reCount(x,y+1,n) + reCount(x-1,y,n) + reCount(x,y-1,n))%m; 
		visited[x][y] = false;
		return memo[x][y]; 

	}

	visited[x][y] = false;
	return 0; 

}

int main(){
	ios::sync_with_stdio(0);
	cin.tie(0);

	int n,i,j; 
	cin >> n;


	rep(i,0,n){
		rep(j,0,n){
			memo[i][j] = -1; 
		}
	}



	rep(i,0,n){
		cin >> grid[i];
	}

	memo[n-1][n-1] = 1; 
	long long result = count(0,0,n); 

	if(result != 0){
		cout << result << endl; 
		return 0; 
	}


	if(result==0){

		rep(i,0,n){
			rep(j,0,n){
				memo[i][j] = -1; 
			}
		}

		memo[n-1][n-1] = 1; 

		result = reCount(0,0,n); 
		//cout << result << endl; 
		if(result == 0)
			cout << "INCONCEIVABLE" << endl; 
		else
			cout << "THE GAME IS A LIE" << endl; 
	}

	return 0; 
}