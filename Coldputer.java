import java.util.Scanner;

public class Coldputer {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int count = 0; 

    int num = scan.nextInt();

    for(int i = 1; i<=num; i++){
      if(scan.nextInt()<0) count++;
    }

    System.out.print(count);
  }
}
