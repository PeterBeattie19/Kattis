import java.util.*;

public class FallingAppart {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>(new Comparator<Integer> (){
        	public int compare(Integer x, Integer y){
            	return -1 * x.compareTo(y); 
        	} 
        }); 

        int num = scan.nextInt(); 

        for(int i = 1; i<=num; i++){
        	heap.add(scan.nextInt());
        }

        int alice = 0, bob = 0;

        for(int i = 0; i<num; i++){
        	if(i%2==0) alice += heap.poll();
        	else bob += heap.poll(); 
        }

        System.out.println(alice +" "+ bob); 

	}
}