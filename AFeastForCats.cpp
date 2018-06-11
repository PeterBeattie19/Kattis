#include <bits/stdc++.h>
using namespace std; 

typedef long long ll;

#define endl "\n"
#define rep(i,a,b) for(int i = a; i<b; i++)


struct edge{
    int d;
    int w;

    bool operator<(const edge &e) const {
        return w > e.w;
    }

    edge(int _d, int _w){
    	d = _d;
    	w = _w; 
    }
};

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
	vis.insert(current);
	add_to_queue(pq,graph[current],vis);

	while(vis.size() < graph.size()){
		edge e = pq.top(); 
		pq.pop(); 
		if(vis.count(e.define) > 0)
			continue; 
		result += e.w; 
		vis.insert(e.d); 
		add_to_queue(pq,graph[e.d],vis); 
	}
	return result; 
}


int main(){
	ios::sync_with_stdio(0);
	cin.tie(0);

	int i,j,k,t,m,c,combo,a,b,w;

	cin >> t; 

	rep(k,0,t){
		cin >> m >> c;
		combo = (c*(c-1))/2;
			
		vector<vector<edge>> graph(c); 
		int dist[c][c]; 
		rep(i,0,combo){
			cin >> a >> b >> w; 
			graph[b].push_back(edge(a,w)); 
			graph[a].push_back(edge(b,w)); 
		}

		int result = mst(graph) + c;

		if(result <= m)
			cout << "yes" << endl;
		else
			cout << "no" << endl; 
	}
	return 0; 
}