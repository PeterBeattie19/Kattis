import java.util.*; 
import java.io.*; 

public class Reseto {
	public static void main (String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		String line[] = br.readLine().split(" "); 
		int n = Integer.parseInt(line[0]);
		int k = Integer.parseInt(line[1]);
		int count = 1;

			boolean arr[] = new boolean[n+1];

	for(int i = 2; i<=n; i++){
		if(arr[i] == false){
			for(int j = i; j<=n; j+=i){
				if(arr[j] == false){
					if(count == k){
						System.out.println(j);
						return;
					}

					arr[j] = true; 
					count++; 
				}
			}
		}
	}

	}
} 