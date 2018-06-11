#include <bits/stdc++.h>
using namespace std; 

typedef long long ll;

#define endl "\n"
#define rep(i,a,b) for(int i = a; i<b; i++)


struct edge{
	int source; 
    int d;
    int w;

    bool operator<(const edge &e) const {
        return w > e.w;
    }

    edge(int _d, int _w,int _s){
    	d = _d;
    	w = _w; 
    	source = _s; 
    }
};

vector<edge> solution; 

int add_to_queue(priority_queue<edge>& pq, vector<edge> v, set<int> vis){
	for(edge e: v){
		if(vis.count(e.d) == 0)
			pq.push(e); 
	}
}

int mst(vector<vector<edge>> graph){
	priority_queue<edge> pq; 
	int result = 0; 
	set<int> vis; 
	int current = 0; 
	add_to_queue(pq,graph[current],vis);

	while(vis.size() < graph.size()){
		edge e = pq.top(); 
		pq.pop(); 
		if(vis.count(e.d) > 0)
			continue; 
		result += e.w; 
		vis.insert(e.d);
		solution.push_back(e); 
		add_to_queue(pq,graph[e.d],vis); 
	}
	return result; 
}


int main(){
	ios::sync_with_stdio(0);
	cin.tie(0);

	int i,j,k,n,a,b,w;


	cin >> n; 
		
	vector<vector<edge>> graph(n); 
	rep(j,0,n){
		rep(i,0,n){
			cin >> w; 
			graph[j].push_back(edge(i,w,j)); 
		}
	}


	int r = mst(graph);

	rep(i,1,n)
		cout << solution[i].source+1 << " " << solution[i].d+1 << endl; 
	return 0; 
}