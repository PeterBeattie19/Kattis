import java.util.*; 
import java.io.*; 

public class HouseOfCards {
	public static void main (String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long x = Long.parseLong(br.readLine()); 

		while((long)Math.floor(((((3*(long)Math.pow(x,2)) + x)/2))) %4 != 0){
			x += 1;
		}

		Long temp = x;
		bw.write(temp.toString()+"\n"); 
		bw.flush(); 

	}
} 