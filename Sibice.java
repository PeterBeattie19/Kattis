import java.util.*;

public class Sibice {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int num = scan.nextInt();
    int w = scan.nextInt();
    w = w*w;
    int h = scan.nextInt();
    h = h*h;
    int l = h + w;

    for (int i = 1; i<=num; i++) {
      int val = scan.nextInt();

      if((val*val) <= l){
        System.out.println("DA");
      }

      else {
        System.out.println("NE");
      }
    }
  }
}
