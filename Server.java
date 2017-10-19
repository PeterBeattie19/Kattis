import java.util.Scanner;

public class Server {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();
    int T = scan.nextInt();
    int sum = 0;
    int count = 0;
    boolean foundAnswer = false;

    for(int i = 0; i<size; i++){
      int val = scan.nextInt();

      if((sum+val)>T) foundAnswer = true;

      if ((sum+val)<=T && foundAnswer==false){
          sum += val;
          count++;
      }
    }

    System.out.println(count);
  }
}
