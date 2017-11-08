import java.util.*;

public class DiceGame {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int g1 = scan.nextInt();
    int g2 = scan.nextInt();
    int g3 = scan.nextInt();
    int g4 = scan.nextInt();

    int gsum = g1 + g2 + g3 + g4;

    int e1 = scan.nextInt();
    int e2 = scan.nextInt();
    int e3 = scan.nextInt();
    int e4 = scan.nextInt();

    int esum = e1 + e2 + e3 + e4;

    if(esum == gsum) System.out.println("Tie");
    else if(esum < gsum) System.out.println("Gunnar");
    if(esum > gsum) System.out.println("Emma");

  }
}
