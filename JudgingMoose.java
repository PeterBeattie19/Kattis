import java.util.Scanner;

public class JudgingMoose {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int left = scan.nextInt();
    int right = scan.nextInt();

    if(left==0 && right==0) System.out.println("Not a moose");

    else if(left==right) System.out.println("Even "+ (left+right));

    else System.out.println("Odd "+ 2*max(left,right));
  }

  public static int max(int a, int b){
    if(a>b) return a;

    return b;
  }
}
