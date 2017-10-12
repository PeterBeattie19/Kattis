import java.util.Scanner;

public class Pot {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int size = scan.nextInt();

    //int ans[] = new int[size];
    int sum = 0;

    for(int i = 0; i<size; i++){
      String s = scan.next();
      int num = Integer.parseInt(s.substring(0,s.length()-1));
      int pow = Integer.parseInt(s.substring(s.length()-1, s.length()));
      sum = sum + (int)Math.pow(num, pow);
    }

    System.out.print(sum);


  }
}
