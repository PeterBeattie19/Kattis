import java.util.*;
import java.lang.*;

public  class BackSpace {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 

		String line = scan.nextLine();

		//Stack<Character> st = new Stack<Character>(); 
		StringBuilder st = new StringBuilder(); 
		int j = 0; 

		for(int i = 0; i<line.length(); i++){

			char c = line.charAt(i); 
			//System.out.println(c);

			if(c == '<') {
				st.deleteCharAt(j-1); 
				j--;
			}

			else {
				st.append(c);   
				j++;
			}
		}

		System.out.println(st.toString()); 
	}
}