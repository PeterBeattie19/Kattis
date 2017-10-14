import java.util.Scanner;

public class Tarifa {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int x = scan.nextInt();
    int size = scan.nextInt();

    //int arr[] =  new int[size];
    int leftOver = x;

    for(int i = 0; i<size; i++){
      int usage = scan.nextInt();
      leftOver -= usage;
      leftOver += x;
    }

    System.out.println(leftOver);
  }
}
