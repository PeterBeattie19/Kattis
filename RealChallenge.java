import java.util.*;

public class RealChallenge {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    long area = scan.nextLong();

    double root = Math.sqrt(area);
    int sides = 4;
    double length = ((double)sides)*root;
    System.out.println(length);
  }
}
