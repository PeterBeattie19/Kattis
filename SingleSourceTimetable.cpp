#include <iostream>
#include <vector>
#include <array>
#include <queue>

using namespace std; 

struct node {
    int u,v,t0,P,d; 
    int w; 

    node(int _u, int _v, int _t0, int _P, int _d){
        u = _u;
        v = _v;
        t0 = _t0; 
        P = _P;
        d = _d; 
    }

    node(int _u, int _w){
        u = _u; 
        w = _w; 
    }

    bool operator < (node e) const {
        return w > e.w;
    }
};

int time_to_wait(int t, int t0, int P, int d){

    if(P==0){ 
        if(t <= t0)
            return (t0-t) + d; 
        else
            return 20000000; //Infinite

    }
    if(t <= t0)
        return d + (t0-t); 

    return (((t-t0+P-1)/P)*P + t0 - t) + d; 
}

int main(){
    
    int n,m,qs,s;
    int u,v,t0,P,d; 

    while(true){
        cin >> n >> m >> qs >> s; 

        if(n==0)
            break;

        vector<vector<node>> graph(n);

        for(int i = 0; i<m; i++){
            cin >> u >> v >> t0 >> P >> d; 
            graph[u].push_back(node(u,v,t0,P,d)); 
        }

        vector<int> times(n+1,20000000);

        times[s] = 0; 

        priority_queue<node> q; 

        q.push(node(s,0)); 


        while(!q.empty()){
            node min = q.top();
            q.pop(); 

            int val = min.u; 

            for(int i = 0; i<graph[val].size(); i++){
                v = graph[val][i].v;    
                t0 = graph[val][i].t0; 
                P = graph[val][i].P; 
                d = graph[val][i].d; 

                int weight_to_neighbour = time_to_wait(times[val],t0,P,d);

                if((times[val] + weight_to_neighbour) < times[v]){
                    times[v] = times[val] + weight_to_neighbour; 
                    q.push(node(v,times[v])); 
                }
            }
        }

        for(int i = 0; i<qs; i++){
            cin >> n;

            if(times[n] == 20000000)
                cout << "Impossible" << endl; 
            else
                cout << times[n] << endl; 
        }
    
        cout << endl; 
    }

    return 0; 
}