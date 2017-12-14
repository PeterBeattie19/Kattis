import java.util.*; 
import java.io.*; 

public class Dominos{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		int numTestCases = Integer.parseInt(br.readLine());


		for(int k = 0; k<numTestCases; k++){
			String line[] = br.readLine().split(" "); 
			int numD = Integer.parseInt(line[0]); //NumD -> Number of Dominos
			int numCon = Integer.parseInt(line[1]); //NumCon -> Number of Connections

			@SuppressWarnings("unchecked")  LinkedList<Integer> graph[] = new LinkedList[numD+1];
			for(int i = 0; i<numD+1; i++){
				graph[i] = new LinkedList<>(); 
			} 

			for(int i = 0; i<numCon; i++){
				line = br.readLine().split(" "); 
				int a = Integer.parseInt(line[0]); 
				int b = Integer.parseInt(line[1]); 
				graph[a].add(b);
				graph[b].add(a); 
			}

			int count = 0;
			HashSet<Integer> visited = new HashSet<>(); 

			for(int i = 1; i<=numD; i++){
				if(visited.add(i) == true){
					count++;
					path(graph[i], visited, graph); 
				}
			}

			System.out.println(count); 
		}
	}

	public static void path(LinkedList<Integer> list, HashSet<Integer> visited, LinkedList<Integer> graph[]){
		for(int i: list){
			//visited.add(i); 
			if(visited.add(i) == true) path(graph[i], visited, graph); 
		}
	}
}
