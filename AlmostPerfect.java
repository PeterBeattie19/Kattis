import java.util.Scanner;

public class AlmostPerfect {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

  /*  while(true){
      int value = scan.nextInt();
      try {
        isPerfect(value);
      }

      catch(java.util.InputMismatchException e) {
        System.out.println(e);
        scan.close();
        break;
      }
    } */
    int n;
    while(scan.hasNextInt()){
      n = scan.nextInt();
      isPerfect(n);

    }

    scan.close();

  }

  public static void isPerfect(int n){
    int sum = 1;
    double root = Math.sqrt(n);

    if((int)root==root) sum += (int)root;

    for(int i = 2; i<=(int)root; i++){
      if (n % i == 0)
  			sum += i + (n / i);
    }



    if(sum==n) System.out.println("perfect");
    else if(Math.abs(n-sum)<=2) System.out.println("almost perfect");
    else System.out.println("not perfect");
  }
}
