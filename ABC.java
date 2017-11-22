import java.util.Scanner;
import java.util.Arrays;

public class ABC  {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int arr[] = new int[3];
    String nums = scan.nextLine();

    String str[] = nums.split(" ");

    arr[0] = Integer.parseInt(str[0]);
    arr[1] = Integer.parseInt(str[1]);
    arr[2] = Integer.parseInt(str[2]);
   

    String order = scan.nextLine();

    Arrays.sort(arr);

    for(int i = 0; i<order.length(); i++){
      char c = order.charAt(i);

      if(c=='A') System.out.print(arr[0] +" ");

      else if(c=='B') System.out.print(arr[1] +" ");

      else if(c=='C') System.out.print(arr[2] +" ");

    }
  }
}
