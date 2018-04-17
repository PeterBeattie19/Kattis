import java.util.*; 
import java.io.*; 

public class ZipfsLaw{
	public static void main (String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		int n = Integer.parseInt(br.readLine());

		String line = br.readLine(); 
		HashMap<String,Integer> map = new HashMap<>();
		HashSet<String> sol = new HashSet<>();  


		while(line != null){

			if(line.matches("EndOfText")){

				printFreq(map,sol,n); 
				sol.clear(); 
				map.clear(); 
				line = br.readLine();

				if(line != null){
					n = Integer.parseInt(line);
					line = br.readLine(); 
				}
				continue;
			}

			line = line.replaceAll("[^a-zA-Z]", " ").toLowerCase();

			String arr[] = line.split(" "); 

			//removeWhiteSpace(arr); 


			for(String x: arr){
				if(x.matches(" "))
					continue;
				if(map.containsKey(x)){
					int temp = map.get(x); 
					map.put(x, temp+1); 
				}

				else
					map.put(x,1); 
				sol.add(x); 
			}

			line = br.readLine(); 
		}
	}

	public static void removeWhiteSpace(String arr[]){
		for(int i = 0; i<arr.length; i++){
            arr[i] = arr[i].replaceAll("[^a-zA-Z]", "").toLowerCase();
			//System.out.println(arr[i]); 
		}
	}

	public static void printFreq(HashMap<String,Integer> map, HashSet<String> set, int n){
		PriorityQueue<String> q = new PriorityQueue<>(); 

		for(String x: set){
			if(map.get(x) == n){
				q.add(x); 
				//System.out.println(x); 
			}
		}



		//System.out.println();

		int size = q.size();

		if(size == 0){
			System.out.println("There is no such word.");
			return; 
		}
		for(int i = 0; i<size; i++)
			System.out.println(q.poll()); 


	}
} 