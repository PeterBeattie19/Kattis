import java.util.*; 
import java.io.*; 

public class shortestpath1 {
	public static void main (String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		String line[] = br.readLine().split(" "); 

		int n = Integer.parseInt(line[0]); 
		int m = Integer.parseInt(line[1]); 
		int q = Integer.parseInt(line[2]); 
		int s = Integer.parseInt(line[3]); 

		while((n+m+q+s) != 0){
			WeightedGraph graph = new WeightedGraph(n,true); 

			for(int i = 0; i<m; i++){
				line = br.readLine().split(" "); 
				int a = Integer.parseInt(line[0]); 
				int b = Integer.parseInt(line[1]); 
				int w = Integer.parseInt(line[2]); 

				graph.createEdge(a,b,w); 
			}

			calculate(graph.graph[s]);

			for(int i = 0; i<q; i++){
				int dest = Integer.parseInt(br.readLine()); 
				if(graph.graph[dest].dist == Integer.MAX_VALUE){
					System.out.println("Impossible"); 
					continue;
				}

				System.out.println(graph.graph[dest].dist); 
			}

			line = br.readLine().split(" "); 

			 n = Integer.parseInt(line[0]); 
			 m = Integer.parseInt(line[1]); 
			 q = Integer.parseInt(line[2]); 
			 s = Integer.parseInt(line[3]);		
		}


		//WeightedGraph graph = new WeightedGraph(5,true); 
	}

	public static void calculate(Node source){
		// Algo:
		// 1. Take the unvisited node with minimum weight.
		// 2. Visit all its neighbours.
		// 3. Update the distances for all the neighbours (In the Priority Queue).
		// Repeat the process till all the connected nodes are visited.
		
		source.dist = 0;
		PriorityQueue<Node> queue = new PriorityQueue<Node>(new Comparator<Node> (){
        	public int compare(Node x, Node y){
            	if(x.dist == y.dist) return 0; 

            	return x.dist - y.dist; 
        	} 
		}); 


		queue.add(source);
		
		while(!queue.isEmpty()){
			
			Node u = queue.poll();
		
			for(Edge neighbour:u.adj){
				int newDist = u.dist+neighbour.weight;
				
				if(neighbour.destination.dist>newDist){
					// Remove the node from the queue to update the distance value.
					queue.remove(neighbour.destination);
					neighbour.destination.dist = newDist;
					
					// Take the path visited till now and add the new node.s
					//neighbour.destination.path = new LinkedList<Vertex>(u.path);
					//neighbour.target.path.add(u);
					
					//Reenter the node with new distance.
					queue.add(neighbour.destination); 					
				}
			}
		}
	}

public static class WeightedGraph{ //Undirected 
	Node[] graph; 
	int numVert; 

	public WeightedGraph(int numVert, boolean setKey){
		this.numVert = numVert; 

		
			graph = new Node[numVert]; 
			for(int i = 0; i<numVert; i++){
				graph[i] = new Node(i); 
			}
		
	}

	public void createEdge(int u, int v, int weight){
		graph[u].setEdge(graph[v], weight);
		//
	}

	public void createNode(int n){ //Nodes are already constructed, it really means set the ID/Key value, used to label each Node
		graph[n].key = n; 
	}
}


public static class Node{
	LinkedList<Edge> adj;
	int key; 
	
	int dist = Integer.MAX_VALUE;

	public Node(int u){
		adj = new LinkedList<>();
		key = u; 
	}

	public void setEdge(Node n, int w){
		adj.add(new Edge(n,w)); 
	}
}

public static class Edge{
	public Node destination;
	public int weight; 

	public Edge(Node v, int weight){
		this.destination = v;
		this.weight = weight; 
	}
}
} 