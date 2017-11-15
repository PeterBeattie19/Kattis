import java.util.*;

public class Statistics {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    //String line = scan.nextLine();
    int count = 1;


    while(scan.hasNext()){

      int l = Integer.MIN_VALUE;
      int s = Integer.MAX_VALUE;
      int size = scan.nextInt();

      for(int i = 0; i<size; i++){
        int val = scan.nextInt();
        if(val < s) s = val;
        if(val > l) l = val;
      }
      System.out.print("Case " +count+ ": ");
      System.out.println(s +" "+ l +" "+ (l - s));
      count++;

    }
    scan.close();
  }
}
