import java.util.Scanner;
import java.math.*; 

public class SimpleAddition {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String num1 = scan.nextLine();
    String num2 = scan.nextLine();

    BigInteger n1 = new BigInteger(num1);
    BigInteger n2 = new BigInteger(num2);

    BigInteger result = n1.add(n2);

    System.out.print(result.toString());
  }
}
