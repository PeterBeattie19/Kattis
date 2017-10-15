import java.util.Scanner;
public class Filip {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n1 = scan.nextInt();
    int n2 = scan.nextInt();

    System.out.println((int)Math.max(flip(n1),flip(n2))); 
  }

  public static int flip(int n){
    int ret = 0;

    ret += (100*(n%10));
    ret += (10*((n%100)/10));
    ret += n/100;

    return ret;
  }
}
