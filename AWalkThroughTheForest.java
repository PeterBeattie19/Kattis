import java.util.*; 
import java.io.*; 

public class AWalkThroughTheForest {
	public static void main (String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		String line[] = br.readLine().split(" "); 

		while(Integer.parseInt(line[0]) != 0){
			ArrayList<Node> graph = new ArrayList<>(); 

			int n = Integer.parseInt(line[0]);
			int m = Integer.parseInt(line[1]);

			for(int i = 0; i<n; i++)
				graph.add(new Node(i));

			for(int i = 0; i<m; i++){
				line = br.readLine().split(" "); 
				int a = Integer.parseInt(line[0])-1;
				int b = Integer.parseInt(line[1])-1;
				int weight = Integer.parseInt(line[2]);
				graph.get(a).addEdge(graph.get(b),weight); 
				graph.get(b).addEdge(graph.get(a),weight); 
			}

			calculate(graph.get(1)); 
			int i = 0;
			int arr[] = new int[n]; 

			System.out.println(graph.size());

			for(Node node: graph){
				arr[i] = node.dist; 
				i++;
			}

			int cache[] = new int[n]; 
			System.out.println(countPaths(graph, arr, cache, 0)); 
			line = br.readLine().split(" "); 

		}

	}

	public static int countPaths(ArrayList<Node> graph, int arr[], int cache[], int n){
		if(n == 1)
			return 1;
		if(cache[n] != 0)
			return cache[n]; 

		int sum = 0;
		for(int i = 0; i<arr.length; i++){
			if(graph.get(i).adj.contains(graph.get(n)) && arr[i] < arr[n])
				sum += countPaths(graph,arr,cache,i); 
		}
		sum = cache[n]; 
		return cache[n]; 
		

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

	public static class Node {
		int key;
		LinkedList<Edge> adj;
		int dist = Integer.MAX_VALUE; 

		public Node(int n){
			this.key = n;
			adj = new LinkedList<>(); 
		}

		public void addEdge(Node n, int weight){
			adj.add(new Edge(n, weight));
		}
	}

	public static class Edge {
		Node destination; 
		int weight;

		public Edge(Node n, int weight){
			this.destination = n;
			this.weight = weight; 
		}
	}
} 