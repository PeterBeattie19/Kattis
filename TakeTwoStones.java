import java.util.Scanner;

public class TakeTwoStones {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();



    if(n%2==1) System.out.println("Alice");

    else System.out.println("Bob");
  }
}
