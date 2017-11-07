import java.util.*;

public class Cetvrta {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int x[] = new int[2];
    int y[] = new int[2];

    x[0] = scan.nextInt();
    y[0] = scan.nextInt();

    int used[] = new int[2];

    for(int i = 2; i<=3; i++){
      int X = scan.nextInt();
      int Y = scan.nextInt();

      if(X != x[0]) x[1] = X;
      else used[0] = X;
      if(Y != y[0]) y[1] = Y;
      else used[1] = Y;
    }
      int x3 = 0;
      if(used[0] == x[0]) x3 = x[1];
      else x3 = x[0];

      int y3 = 0;
      if(used[1] == y[0]) y3 = y[1];
      else y3 = y[0];

      System.out.println(x3 +" "+ y3);

  }
}
