import java.util.*;

public class TheEasiestProblemIsThisOne {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    while(true){
      int n = scan.nextInt();
      if(n==0) break;
      int sumn = sum(n);
      int i = 11;
      while(true){
        if(sum(n*i) == sumn) {
          System.out.println(i);
          break;
        }
        i++;
      }
    }
  }

  public static int sum(int n){
    int s = 0;
    while(n > 0){
      s += n%10;
      n /= 10;
    }
    return s;
  }
}
