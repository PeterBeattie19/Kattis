import java.util.*;

public class DifferentProblem {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    while(scan.hasNext()){
      long a = scan.nextLong();
      long b = scan.nextLong();

      System.out.println(Math.abs(b - a));
    }


  }
}
