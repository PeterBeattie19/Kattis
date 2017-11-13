import java.util.*;

public class Skocimis {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();

    int diff1 = (b - a) - 1;
    int diff2 = (c - b) - 1;

    if((diff1 == 0 && diff2 != 0) || (diff2 >= diff1)){
    System.out.println(diff2);
    }

    else {
      System.out.println(diff1);
    }

  }
}
