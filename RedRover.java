import java.util.*;
import java.lang.*;

public class RedRover {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 

		String s = scan.nextLine(); 


		/*if(allSame(s)){
			System.out.println((int)Math.sqrt(s.length()) * 2); 
			return;
		}*/


		HashSet<String> checked = new HashSet<String>(); 
		int min = Integer.MAX_VALUE; 
		String maxString = "";
		int longest = 0;

		for(int i = 1; i<=s.length(); i++){
			for(int j = 0; j<=s.length()-i; j++){

				String ch = s.substring(j,j+i);

				if(checked.add(ch) == false) continue;
				int count = findCount(s,ch);


				int ans = s.length() - (i*count) + count + i;
				//if(count==1 && i==1)ans--; 

				//System.out.println(count);

				if(ans < min){
				 min = ans;  
				 //System.out.println(min +" "+ ch +" "+ count);

				 maxString = ch;
				}
			}
		}

		if(min > s.length()) System.out.println(s.length());
		else
		System.out.println(min);
		//System.out.println(maxString);
	}

  	public static int findCount(String s1, String s2){

  		int l1 = s1.length();
  		int l2 = s2.length(); 
  		int count = 0;

  		for(int i = 0; i<=(l1-l2); i++){
  			if(s2.matches(s1.substring(i,i+l2))){
  			 count++;
  			 i += (l2-1);
  			}
  		}
  		return count; 
	}
}