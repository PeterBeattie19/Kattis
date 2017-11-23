import java.util.*;

public class Akcija {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(); //Min Heap

		int size = scan.nextInt(); 

		//int arr[] = new int[size]; 

		for(int i = 0; i<size; i++){
			q.add(scan.nextInt()); 
		}

		int n = size/3; 
		int sum = 0; 

		for(int i = 1; i<=n; i++){
			q.poll(); 
		}

		for(int i: q){
			sum += i; 
		}

		System.out.println(sum); 

	}
}