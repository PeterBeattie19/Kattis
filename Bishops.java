import java.util.*; 
import java.io.*; 

public class Bishops {
	public static void main (String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
   		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


		String line = br.readLine(); 

		while(line.matches("") == false){
			int n = Integer.parseInt(line); 

			if(n == 1)
				bw.write("1\n"); 
			else{
				Integer res = 2*n -2;
				bw.write(res.toString() +"\n");
			}

			line = br.readLine();
		}

		bw.flush(); 
	}

	}
