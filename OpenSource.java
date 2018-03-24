import java.util.*; 
import java.io.*; 

public class OpenSource{
	public static void main (String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		

		while(true){
			String line = br.readLine(); 

			if(line.matches("0"))
				break;

			HashSet<String> nogo = new HashSet<>(); 
			HashMap<String, String> sc = new HashMap<>(); 
			HashMap<String,Integer> cn = new HashMap<>(); 
			ArrayList<String> companies =new ArrayList<>(); 
			String company = new String(line); 

			while(true){
				if(line.matches("1"))
					break;

				if(line.matches(line.toUpperCase())){
					//System.out.println("true " +line);
					company = new String(line); 
					companies.add(company); 
					cn.put(company, 0); 
					line = br.readLine(); 
					//System.out.println(cn.get(company)); 
					continue; 
				}


				if(nogo.contains(line)){
					line = br.readLine();
					continue; 
				}

				if(sc.containsKey(line) && sc.get(line).matches(company)==true){
					line = br.readLine(); 
					continue; 
				}

				if(sc.containsKey(line) && sc.get(line).matches(company)==false){
					int n = cn.get(sc.get(line))-1;
					cn.put(sc.get(line),n); 
					nogo.add(line); 
					line = br.readLine(); 
					//System.out.println(cn.get(company)); 
					continue;
				}

				if(sc.containsKey(line) == false){
					sc.put(line,company); 
					int n = cn.get(company)+1; 
					cn.put(company, n); 
					//System.out.println(n); 
				}



				line = br.readLine(); 
			}

			ArrayList<Node> sort = new ArrayList<>(); 

			for(String t: companies)
				sort.add(new Node(t,cn.get(t))); 

			Collections.sort(sort); 

			for(Node t: sort)
				System.out.println(t.s +" "+ t.n); 

		}
	}

	public static class Node implements Comparable<Node>{
		String s;
		int n; 

		public Node(String s, int n){
			this.s = s; 
			this.n = n; 
		}

		public int compareTo(Node c){
			if(this.n == c.n)
				return this.s.compareTo(c.s); 
			return c.n - this.n; 
		}

	}
} 