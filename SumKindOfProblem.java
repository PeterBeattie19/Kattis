import java.util.Scanner;

public class SumKindOfProblem {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int numTest = scan.nextInt();

    for(int i = 1; i<=numTest; i++){
      int n = scan.nextInt();
      int k = scan.nextInt();

      System.out.print(n +" ");
      System.out.print(sum(k) +" ");
      System.out.print(sumOdd(k) +" ");
      System.out.println(sumEven(k));


    }
  }

  public static int sumEven(int n){
    int sum = 0;
    int count = 1;

      while(count<=n){
        sum += (2*count);
        count++; 
      }

    return sum;
  }

  public static int sumOdd(int n){
    int sum = 0;
    int count = 1;

    while(count<=n){
      sum += (1 + ((count-1)*2));
      count++;
    }
    return sum;
  }

  public static int sum(int n){
    int sum = 0;
    int i = 1;

    while(i<=n){
      sum += i;
      i++;
    }
    return sum;
  }
}
