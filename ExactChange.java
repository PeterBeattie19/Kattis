import java.util.*;

public class ExactChange {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int numberOfTestCases = scan.nextInt();

    for(int i = 1; i<=numberOfTestCases; i++){
      int amount = scan.nextInt();
      int numCoins = scan.nextInt();

      PriorityQueue<Integer> q = new PriorityQueue<>();

      for(int j = 0; j<numCoins; j++){
        q.add(scan.nextInt());
      }

      int sum = 0;
      int count = 0;
      while(sum < amount){
        sum += q.poll();
        count++;
      }

      System.out.print(sum +" "+ count);
    }
  }
}
