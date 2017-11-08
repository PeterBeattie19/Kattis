import java.util.*;

public class SimonSays {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int numTest = scan.nextInt();

    for(int i = 1; i<=numTest+1; i++){
      String s = scan.nextLine();

      if(s.matches("simon says.*") && s.length()>11){
        System.out.println(s.substring(11,s.length()));
      }
      else {
        System.out.println();
      }
    }
  }
}
