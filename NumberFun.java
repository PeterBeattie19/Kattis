import java.util.Scanner;

public class NumberFun {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int testCases = scan.nextInt();

    for(int i = 1; i<=testCases; i++){
      int a = scan.nextInt();
      int b = scan.nextInt();

      int target = scan.nextInt();

      if(a+b == target) System.out.println("Possible");
      else if(Math.abs(a-b) == target) System.out.println("Possible");
      else if(a*b == target) System.out.println("Possible");
      else if((a/b == target && a%b == 0)|| (b/a == target && b%a == 0)) System.out.println("Possible");
      else System.out.println("Impossible");
    }
  }
}
