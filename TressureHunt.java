import java.util.Scanner; 

public class TressureHunt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 

		String s[] = scan.nextLine().split(" ");

		int rows = Integer.parseInt(s[0]);
		int cols = Integer.parseInt(s[1]);

		char arr[][] = new char[rows][cols]; 

		for(int i = 0; i<rows; i++){
			String line = scan.nextLine();
			for(int j = 0; j<cols; j++){
				arr[i][j] = line.charAt(j); 
			}
		}

		int r = 0;
		int c = 0; 
		int count = 0; 
		while(true){

			if(r >= rows || c >= cols || r<0 || c<0){
				System.out.println("out");
				return;
			}

			if(count == rows*cols){
				System.out.println("lost");
				return; 
			}

			char temp = arr[r][c]; 
			if(temp == 'T'){
				System.out.println(count);
				break;
			}
			count++; 
			if(temp == 'N') r -= 1;
			if(temp == 'S') r += 1;
			if(temp == 'W') c -= 1;
			if(temp == 'E') c += 1;
		}

		

	}
}