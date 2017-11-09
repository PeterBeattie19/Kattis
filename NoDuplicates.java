import java.util.*;

public class NoDuplicates {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s1 = scan.nextLine();

       	String s[] = s1.split(" ");
       	Set<String> set = new HashSet<String>();
       	boolean check = false;

       	for(String i: s){
       		if(set.add(i) == false){
       			check = true;
       			break;
       		}
       	}

       	if(check == true){
       		System.out.println("no");
       	}

       	else {
       		System.out.println("yes");
       	}


    }
}
