import java.util.*; 
import java.io.*; 

public class Simplicity{
	public static void main (String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = br.readLine();
		HashSet<Character> used = new HashSet<>(); 
		int count[] = new int[26]; 
		int simplicity = 0;

		for(int i = 0; i<s.length(); i++){
			char c = s.charAt(i);
			if(used.add(c) == true)
				simplicity++;
			count[getCharValue(c)]++; 
		}

		if(simplicity <= 2){
			//System.out.print("0"); 
			bw.write("0");
			bw.flush(); 
			return; 
		}

		int delete = used.size() - 2;
		Arrays.sort(count); 

		int n = 0;
		int num = 0; 

		for(int i: count){
			if(i != 0){
				n += i; 
				num++;
				if(num == delete)
					break; 
			}
		}

		//System.out.println(n); 
		Integer temp = n;
		bw.write(temp.toString());
		bw.flush(); 

	}

	public static int getCharValue(char c){
		return (c - 'a'); 
	}
} 