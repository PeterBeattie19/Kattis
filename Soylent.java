import java.util.Scanner;

public class Soylent {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int numTest = scan.nextInt();

    for(int i = 1; i<=numTest; i++){
      double n = scan.nextDouble();
      double num = n/400;
      int val = (int)Math.ceil(num);
      System.out.println(val);
    }
  }
}
