import java.util.Scanner;

public class PrimeSieve {
   static int count = 0;
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int q = scan.nextInt();


    boolean arr[] = generatePrimes(n);
    System.out.println(count);

    for(int i = 0; i<q; i++){
      int num = scan.nextInt();
      if(arr[num] == true) System.out.println("1");
      else System.out.println("0");
    }
  }

  public static boolean[] generatePrimes(int max){
    boolean arr[] = new boolean[max+1];

    for(int i = 1; i<=max; i++){
      if(isPrime(i)){
         arr[i] = true;
         count++;
       }
    }
    return arr;
  }

  public static boolean isPrime(int n){
    if(n==1) return false;
    if(n==2 || n==3 || n==5 || n==7 ) return true;
    if((n%10) % 2 == 0 || (n%10 == 5)) return false;

    for(int i = 2; i<=(int)Math.sqrt(n); i++){
      if(n%i == 0) return false;
    }
    return true;
  }
}
