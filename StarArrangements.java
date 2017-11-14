import java.util.*;

public class StarArrangements {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    System.out.println(n +":");

    for(int i = 2; i<=(n/2)+1; i++){
      for(int j = i-1; j<i+1; j++){
        if(check(i,j,n)==true){
          System.out.println(i +","+ j);
        }
      }
    }
  }

  public static boolean check(int i, int j, int n){
    int sum = 0;
  //  boolean ans = false;

    int k = 0;

    if(i+j == n) return true;

    while(sum < n ){
      if(k%2==0){
        sum += i;
      }
      else {
        sum += j;
      }
      k++;
    }

    if(sum == n) return true;
    else return false;
  }
}
