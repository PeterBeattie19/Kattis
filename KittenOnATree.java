import java.util.*; 
import java.io.*; 
/* Use HasMap for faster result
*/
public class KittenOnATree {
	public static void main (String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		String start = br.readLine(); 
		String line[] = br.readLine().split(" "); 
		ArrayList<String[]> graph = new ArrayList<>(); 
		while(Integer.parseInt(line[0]) != -1){
			//int parent = Integer.parent(line[0]); 

			graph.add(line); 
			line = br.readLine().split(" "); 
		}

		//Searching for start 

		do {
			System.out.print(start +" "); 
			start = findParent(start, graph); 
		}

		while(start.matches("-1") == false); 
	}

	public static String findParent(String start, ArrayList<String[]> graph ){
		for(String s[]: graph){
			for(int i = 1; i<s.length; i++){
				if(s[i].matches(start)){
					return s[0]; 
				}
			}
		}
		return "-1"; 
	}
} 
