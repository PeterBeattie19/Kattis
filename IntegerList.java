import java.util.*; 
import java.io.*; 

public class IntegerList{
	public static void main (String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		int t = Integer.parseInt(br.readLine());

		for(int test = 0; test<t; test++){
			String cmd = br.readLine(); 
			int size = Integer.parseInt(br.readLine());

			String line = br.readLine();

			if(size == 0){
				boolean found = false;

				for(int i = 0; i<cmd.length(); i++){
					if(cmd.charAt(i) == 'D'){
						found = true;
						break;
					}
				}

				if(found == true)
					System.out.println("error"); 
				else
					System.out.println("[]");

				continue; 
			}

			line = line.substring(1,line.length()-1); 

			LinkedList<Integer> arr = convert(line); 
			int d = 1;
			boolean error = false;

			for(int i = 0; i<cmd.length(); i++){

				/*for(int j: arr)
					System.out.print(j +" "); 
				System.out.println(); */

				if(cmd.charAt(i) == 'R'){
					d = (d==0) ? 1 : 0; 
					continue;
				}

				if(arr.size() == 0){
					if(cmd.charAt(i) == 'R')
						continue;

					error = true;
					break; 
				}

				if(d == 1)
					arr.pollFirst();
				else
					arr.pollLast(); 
			}

			if(error){
				System.out.println("error"); 
				continue;
			}

			Integer res[] = new Integer[arr.size()]; 
			res = arr.toArray(res); 

			print(d,res); 
		}
	}

	public static LinkedList<Integer> convert(String s){
		String t[] = s.split(","); 
		LinkedList<Integer> res = new LinkedList<>(); 

		for(String q: t)
			res.add(Integer.parseInt(q)); 

		return res; 

	}

	public static void print(int d, Integer arr[]){
		if(d == 1){
			String s = Arrays.toString(arr); 
    		String l[] = s.split(" "); 
    
    		for(String i: l)
      			System.out.print(i); 
      		System.out.println(); 
		}


		else{
			int temp[] = new int[arr.length]; 

			for(int i = 0; i < arr.length; i++){
				temp[i] = arr[arr.length-1-i];
			}
			String s = Arrays.toString(temp); 
			String l[] = s.split(" "); 

    		for(String i: l)
      			System.out.print(i); 

      		System.out.println(); 

		}
	}
} 