import java.util.*; 
import java.io.*; 

public class BigTruck {
	public static void main (String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		ArrayList<LinkedList<Integer>> graph = new ArrayList<>();

		int numNodes = Integer.parseInt(br.readLine()); 

		int load[] = new int[numNodes]; 

		String line[] = br.readLine().split(" "); 

		for(int i = 0; i<numNodes; i++)
			load[i] = Integer.parseInt(line[i]); 

		int m = Integer.parseInt(br.readLine()); 

		if(m == 0){
			System.out.println("impossible"); 
			return; 
		}

		int weight[][] = new int[numNodes][numNodes]; 

		for(int i = 0; i<m; i++)
			graph.add(new LinkedList<>()); 

		for(int i = 0; i<m; i++){
			line = br.readLine().split(" "); 
			int a = Integer.parseInt(line[0])-1;
			int b = Integer.parseInt(line[1])-1;
			int w = Integer.parseInt(line[2]); 

			graph.get(a).add(b); 
			graph.get(b).add(a); 

			weight[a][b] = w;
			weight[b][a] = w; 
		}

		int dist[] = new int[numNodes]; 

		Arrays.fill(dist, Integer.MAX_VALUE); 

		calculate(graph, 0, dist, weight); 

		if(dist[numNodes-1] == Integer.MAX_VALUE){
			System.out.println("impossible"); 
			return; 
		}

		


		int cache[] = new int[numNodes];
		Arrays.fill(cache, -1); 
		int n = max(graph, numNodes-1, cache, weight, dist, load); 

		System.out.print(dist[numNodes-1] +" "); 
		System.out.print(n); 

	}

	public static void calculate(ArrayList<LinkedList<Integer>> g, int source, int dist[], int w[][]){
		// Algo:
		// 1. Take the unvisited node with minimum weight.
		// 2. Visit all its neighbours.
		// 3. Update the distances for all the neighbours (In the Priority Queue).
		// Repeat the process till all the connected nodes are visited.
		
		//source.dist = 0;
		dist[source] = 0; 
		PriorityQueue<Integer> queue = new PriorityQueue<>();  


		queue.add(source);
		
		while(!queue.isEmpty()){
			
			int u = queue.poll();
		
			for(int neighbour: g.get(u)){
				int newDist = dist[u] + w[neighbour][u];
				
				if( dist[neighbour] > newDist){
					// Remove the node from the queue to update the distance value.
					queue.remove(neighbour);
					//neighbour.destination.dist = newDist;
					dist[neighbour] = newDist; 
					
					// Take the path visited till now and add the new node.s
					//neighbour.destination.path = new LinkedList<Vertex>(u.path);
					//neighbour.target.path.add(u);
					
					//Reenter the node with new distance.
					queue.add(neighbour); 					
				}
			}
		}
	}

	//Use DP to find optimal solution 
	public static int max(ArrayList<LinkedList<Integer>> graph, int s, int cache[], int weight[][], int dist[], int load[]){
		if(cache[s] != -1)
			return cache[s]; 

		if(s == 0)
			return load[s];

		int l = Integer.MIN_VALUE; 

		for(int i: graph.get(s))
			if(dist[i] + weight[s][i] == dist[s])
				l = Math.max(l, max(graph, i, cache, weight, dist, load)); 

		cache[s] = l + load[s];
		return cache[s]; 
	}

} 