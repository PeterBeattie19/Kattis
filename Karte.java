import java.util.Scanner;

public class Karte {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int arr[] = new int[4]; 
		int p[] = new int[14];
		int k[] = new int[14];
		int h[] = new int[14];
		int t[] = new int[14];


		String s = scan.nextLine(); 

		for(int i = 0; i<s.length(); i+=3){
			char c = s.charAt(i);

			if(c == 'P'){
				int n = Integer.parseInt(s.substring(i+1,i+3));
				if(p[n] == 0){
					arr[0]++; 
					p[n] = 1;
				}
				else{
					System.out.print("GRESKA");
					return;
				}
			}

			if(c == 'K'){
				int n = Integer.parseInt(s.substring(i+1,i+3));
				if(k[n] == 0){
					arr[1]++; 
					k[n] = 1;
				}
				else{
					System.out.print("GRESKA");
					return;
				}
			}
			if(c == 'H'){
				int n = Integer.parseInt(s.substring(i+1,i+3));
				if(h[n] == 0){
					arr[2]++; 
					h[n] = 1;
				}
				else{
					System.out.print("GRESKA");
					return;
				}
			}

			if(c == 'T'){
				int n = Integer.parseInt(s.substring(i+1,i+3));
				if(t[n] == 0){
					arr[3]++; 
					t[n] = 1;

				}
				else{
					System.out.print("GRESKA");
					return;
				}
			}			

		}

		for(int i: arr) System.out.print((13 - i) +" ");

	}
}