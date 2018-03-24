import java.util.*; 
import java.io.*; 

public class TornToPieces{

	public static ArrayList<String> result = new ArrayList<>(); 
	public static void main (String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		int n = Integer.parseInt(br.readLine());

		HashMap<String, ArrayList<String>> map = new HashMap<>(); 

		
		for(int i = 0; i<n; i++){
			String line[] = br.readLine().split(" "); 

			if(map.containsKey(line[0])==false)
				map.put(line[0],new ArrayList<>());

			for(int j = 1; j<line.length; j++){
				map.get(line[0]).add(line[j]); 

				if(map.containsKey(line[j]) == false)
					map.put(line[j], new ArrayList<>()); 

				map.get(line[j]).add(line[0]); 
			}
		}


		String line[] = br.readLine().split(" "); 
		HashSet<String> visited = new HashSet<>();

 

		boolean res = dfs(map,line[0],line[1],visited); 

		if(res==false){
			System.out.println("no route found");
			return; 
		}
		//result.add(line[0]);

		for(int i = result.size()-1; i>=0; i--)
			System.out.print(result.get(i) +" "); 
	}

	public static boolean dfs(HashMap<String, ArrayList<String>> map, String u, String v, HashSet<String> visited){
		visited.add(u); 
		boolean check = false;

		if(u.matches(v)){
			result.add(u);
			return true; 
		}

		if(map.containsKey(u)==false)
			return false;

		for(String s: map.get(u)){
			if(visited.contains(s)==false && map.containsKey(s)){
				check = dfs(map,s,v,visited);
				if(check==true){
					result.add(u);
					return true;  
				}

			}
		}

		return false;
	}
} 