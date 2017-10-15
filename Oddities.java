import java.util.Scanner;
public class Oddities {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int num = scan.nextInt();

    for(int i = 1; i<=num; i++){
      int n = scan.nextInt();
      if(Math.abs(n)%2==0) System.out.println(n+" is even");
      else System.out.println(n+" is odd"); 
    }
  }

}
