import java.util.*; 
import java.io.*; 

public class IslandHopping{
	public static void main (String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		int numTests = Integer.parseInt(br.readLine()); 

		for(int k = 1; k<=numTests; k++){
			int numIslands = Integer.parseInt(br.readLine()); 

			Node graph[] = new Node[numIslands]; 

			 
			String line[];

			for(int i = 0; i<numIslands; i++){
				line = br.readLine().split(" "); 
				graph[i] = new Node(Double.parseDouble(line[0]) , Double.parseDouble(line[1])); 
			}

			double distances[][] = new double[numIslands][numIslands]; //Store distances from each node to every other node.

			for(int i = 0; i<numIslands; i++){
				Node current = graph[i]; 
				for(int j = 0; j<numIslands; j++){
					double tempx = Math.abs(graph[i].x - graph[j].x);
					double tempy = Math.abs(graph[i].y - graph[j].y); 

					tempx = Math.pow(tempx ,2); 
					tempy = Math.pow(tempy ,2); 

					distances[i][j] = Math.sqrt(tempy + tempx); 
				}
			}

			System.out.println(MST(distances, numIslands)); 
		}
	}

	public static double MST(double distances[][], int num){
		boolean visited[] = new boolean[num]; 
		double result = 0;
		visited[0] = true;
		int numCon = 1; 

		double min[] = new double[num]; 

		for(int i = 0; i<num; i++){
			min[i] = distances[0][i]; 
		}

		while(numCon != num){

			int smallIndex = -1; 
			double small = Integer.MAX_VALUE; 

			for(int i = 0; i<num; i++){
				if(visited[i] == false && min[i] < small){
					small = min[i]; 
					smallIndex = i; 
				}
			}

			visited[smallIndex] = true;
			result += small; 
			numCon++; 

			for(int i = 0; i<num; i++){
				min[i] = Math.min(min[i], distances[smallIndex][i]); 
			}

		}

		return result; 
	}

	public static class Node{
		double x;
		double y; 

		public Node(double x, double y){
			this.x = x;
			this.y = y; 
		}
	}

} 