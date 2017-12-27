import java.util.*; 
import java.io.*; 

public class ReachableRoads{
	public static void main (String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		

		int numTest = Integer.parseInt(br.readLine()); 
		String line[]; 

		for(int k = 0; k<numTest; k++){
			ArrayList<LinkedList<Integer>> graph = new ArrayList<>(); 
			int numNodes = Integer.parseInt(br.readLine()); 
			int connected[] = new int[numNodes]; 

			for(int i = 0; i<numNodes; i++){
				graph.add(new LinkedList<>()); 
				connected[i] = i; 
			}

			int connections = Integer.parseInt(br.readLine()); 

			for(int i = 0; i<connections; i++){
				line = br.readLine().split(" "); 
				int a = Integer.parseInt(line[0]);
				int b = Integer.parseInt(line[1]);

				graph.get(a).add(b);
				graph.get(b).add(a);  
			}

			int buildCount = 0; 
			int current = 0; 

			HashSet<Integer> visited = new HashSet<>(); 
			while (visited.size() != numNodes) {
				dfs(graph, visited, connected, current);
				current = findNext(connected); 
				if(current != -1)
					buildCount++; 
			}
			
			System.out.println(buildCount); 
		}
	}

	public static void dfs(ArrayList<LinkedList<Integer>> graph, HashSet<Integer> visited, int connected[], int current){
		visited.add(current); 
		connected[current] = -1;

		for(int i: graph.get(current)){
			if(visited.add(i) == true){
				connected[current] = -1;
				dfs(graph, visited, connected, i); 
			}
		}
		return; 
	}

	public static int findNext(int arr[]){
		for(int i: arr)
			if(i != -1)
				return i;
		return -1; 
	}
} 