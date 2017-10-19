import java.util.Scanner;

public class Herman {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    double r = scan.nextDouble();

    double taxiCab = 2*(r*r);

    double normal = Math.PI*(r*r);

    System.out.println(normal);
    System.out.println(taxiCab);
  }
}
