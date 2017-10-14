import java.util.Scanner;

public class Trik {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String s = scan.nextLine();
    int arr[] = new int[3];

    arr[0] = 1;
    arr[1] = 0;
    arr[2] = 0;

    for(int i = 0; i<s.length(); i++){
      char current = s.charAt(i);

      if(current=='A'){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
      }

      else if(current=='B'){
        int temp = arr[1];
        arr[1] = arr[2];
        arr[2] = temp;
      }

      else if(current=='C'){
        int temp = arr[0];
        arr[0] = arr[2];
        arr[2

        ] = temp;
      }
    }


    if(arr[0]==1) System.out.println("1");
    else if(arr[1]==1) System.out.println("2");
    else if(arr[2]==1) System.out.println("3");
  }
}
