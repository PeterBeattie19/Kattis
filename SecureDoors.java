import java.util.*; 

public class SecureDoors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int num = Integer.parseInt(sc.nextLine()); 
		HashSet<String> set = new HashSet<String>(); 

		for(int i = 1; i<=num; i++){
			String line[] = sc.nextLine().split(" "); 

			if(line[0].matches("entry")){
				if(set.add(line[1]) == false){
					System.out.println(line[1] +" entered (ANOMALY)");
				}
				else {
					System.out.println(line[1] + " entered"); 
				}
			}

			else if(line[0].matches("exit")){
				if(set.contains(line[1]) == false){
					System.out.println(line[1] +" exited (ANOMALY)");
				}

				else {
					set.remove(line[1]); 
					System.out.println(line[1] + " exited"); 
				}
			}

		}


		
	}
}