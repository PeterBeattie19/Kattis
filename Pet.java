import java.util.Scanner;
public class Pet {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int largest = 0;
    int index = 0;

    for(int i = 1; i<=5; i++){
      int sum = 0;
      for(int j = 1; j<=4; j++){
        sum += scan.nextInt();
      }
      if(sum>largest){
        largest = sum;
        index = i;
      }
    }

    System.out.println(index+" "+largest);
  }
}
