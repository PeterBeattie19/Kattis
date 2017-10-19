import java.util.Scanner;

public class PaulEigon {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int p = scan.nextInt();
    int q = scan.nextInt();

    int value = (p+q)/n;

    if(value%2==0) System.out.println("Paul");
    else System.out.println("Opponent");
  }
}
