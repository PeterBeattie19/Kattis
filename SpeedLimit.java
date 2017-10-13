import java.util.Scanner;

public class SpeedLimit {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int num = scan.nextInt();
    while(num!=-1){
      int speed[] = new int[num];
      int time[] = new int[num];
      for(int i = 0; i<num; i++){
        speed[i] = scan.nextInt();
        time[i] = scan.nextInt();
      }
      System.out.println(dist(speed,time) +" miles");
      num = scan.nextInt();
    }


  }

  public static int dist(int speed[], int time[]){
    int sum = speed[0]*time[0];

    for(int i = 1; i<speed.length; i++){
      int diff = Math.abs(time[i]-time[i-1]);
      sum += speed[i]*diff;
    }

    return sum;
  }
}
