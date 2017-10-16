import java.util.*;
public class GrassSeed {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    double price = scan.nextDouble();

    int numTests = scan.nextInt();
    double sum = 0;

    for(int i = 0; i<numTests; i++){
      double l = scan.nextDouble();
      double w = scan.nextDouble();

      double area = l*w;
      double ans = area*price;
      sum += ans;
    }

    System.out.println(sum);
  }
}
