#include <iostream>
#include <vector> 
using namespace std; 


struct edge{
  int u,v,w;
  
  edge(int _u, int _v, int _w){
    u = _u; 
    v = _v;
    w = _w; 
  }
};


int main() {
  
  int n,m,q,s; 
  int a,b,w; 
  
  while(true){
      cin >> n >> m >> q >> s; 
      
      if(n==0 && m==0 && q==0 && s==0)
        break; 
    vector<edge> graph;
    
    for(int i = 0; i<m; i++){
      cin >> a >> b >> w;
      graph.push_back(edge(a,b,w)); 
    }
    
    vector<int> dist(n, 2147483647); 
    
    dist[s] = 0; 
    
    for(int i = 1; i<n; i++){
      for(int j = 0; j<m; j++){
        int u = graph[j].u; 
        int v = graph[j].v;
        int weight = graph[j].w; 
        
        if(dist[u]!=2147483647 && (dist[u] + weight <  dist[v]))
          dist[v] = dist[u] + weight;  
      }
    }
    
    /*for(int i = 0; i<m; i++){
        if(dist[graph[i].u] != 2147483647 && dist[graph[i].u] + graph[i].w < dist[graph[i].v])
            dist[graph[i].v] = -2147483647; 
    }*/
    
    for(int i = 0; i<n; i++){
      for(int j = 0; j<m; j++){
        int u = graph[j].u; 
        int v = graph[j].v;
        int weight = graph[j].w; 
        
        if(dist[u]!=2147483647 && (dist[u] + weight <  dist[v]))
          dist[v] = -2147483647;  
      }
    }
    
    
    for(int i = 0; i<q; i++){
      cin >> a; 
      
      if(dist[a] == -2147483647)
        cout << "-Infinity" << endl;
      else if(dist[a] == 2147483647)
        cout << "Impossible" << endl; 
      else
        cout << dist[a] << endl; 
    }
    
    printf("\n");
    
  }
  return 0;
  
}
