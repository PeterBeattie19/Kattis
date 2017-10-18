import java.util.Scanner;

public class SevenWonders {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String s = scan.nextLine();

    int arr[] = new int[3];

    for(int i = 0; i<s.length(); i++){
      if(s.charAt(i)=='T') arr[0]++;
      else if(s.charAt(i)=='G') arr[1]++;
      else if(s.charAt(i)=='C') arr[2]++;
    }

    //Find smallest value
    int smallest = arr[0];
    for(int i = 1; i<=2; i++){
      if(arr[i]<smallest) smallest = arr[i];
    }

    int sevenSum = 7*(smallest);
    int sum = sevenSum;

    for(int i = 0; i<3; i++){
      sum += (arr[i]*arr[i]);
    }

    System.out.println(sum);
  }
}
