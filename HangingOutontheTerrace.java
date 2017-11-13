import java.util.*;

public class HangingOutontheTerrace {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int max = scan.nextInt();
    int num = scan.nextInt();
    int currentsize = 0;
    int count = 0;

    for(int i = 0; i<num; i++){
      String q = scan.next();
      int amount = scan.nextInt();

      if(q.matches("enter")){
        if((currentsize + amount) > max){
          count++;
        }
        else{
          currentsize += amount;
        }
      }

      else {
        currentsize -= amount;
      }
    }

    System.out.println(count);
  }
}
