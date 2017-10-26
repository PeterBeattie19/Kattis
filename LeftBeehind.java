import java.util.Scanner;

public class LeftBeehind {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int x = scan.nextInt();
    int y = scan.nextInt();

    while(true){
      if(x+y == 13) System.out.println("Never Speak Again.");
      else if(x<y) System.out.println("Left beehind.");
      else if(x>y) System.out.println("To the convention.");
      else if(x==y) System.out.println("Undecided.");

      x = scan.nextInt();
      y = scan.nextInt();

      if(x==0 && y==0) break; 
    }

  }
}
