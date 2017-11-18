import java.util.*; 

public class TheDragonOfLooWater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 


		int dk[] = new int[2];
		dk[0] = sc.nextInt(); 
		dk[1] = sc.nextInt(); 




		while(dk[0] != 0){
			int heads[] = new int[dk[0]]; 
			int knights[] = new int[dk[1]]; 

			for(int i = 0; i<heads.length; i++){
				heads[i] = sc.nextInt(); 
			}

			for(int i = 0; i<knights.length; i++){
				knights[i] = sc.nextInt(); 
			}

			Arrays.sort(heads); 
			Arrays.sort(knights); 

			findKnights(heads,knights); 

			dk[0] = sc.nextInt(); 
			dk[1] = sc.nextInt(); 
		}

	}

	public static void findKnights(int heads[], int knights[]){

		int j = 0; 
		boolean check = false; 
		int sum = 0; 

		for(int i = 0; i<heads.length; i++){
			while(j < knights.length && knights[j] < heads[i]) j++; 

			if(j >= knights.length) {
				check = true;
				break; 
			}

			sum += knights[j]; 
			j++; 
		}

		if(check == true) System.out.println("Loowater is doomed!"); 
		else System.out.println(sum); 
	}	
}