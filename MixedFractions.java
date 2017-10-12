import java.util.Scanner;

public class MixedFractions {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();

    while(num1!=0 && num2!=0){
      int whole = num1/num2;
      int numer = num1%num2;
      System.out.println(whole +" "+ numer +" / "+ num2);

       num1 = scan.nextInt();
       num2 = scan.nextInt();
    }
  }
}
