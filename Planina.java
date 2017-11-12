import java.util.*;

public class Planina {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();

    int result = (int)Math.pow(4, n) + f(n);
    System.out.println(result);
  }

  public static int f(int n){
    if(n==1) return 5;
    else {
      return f(n-1) + (int)Math.pow(2, n);
    }
  }
}
