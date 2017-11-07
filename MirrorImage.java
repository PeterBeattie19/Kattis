import java.util.*;

public class MirrorImage {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int tests = scan.nextInt();

    for(int n = 1; n<=tests; n++){
      int rows = scan.nextInt();
      int cols = scan.nextInt();

      String arr[][] = new String[rows][cols];

      for(int i = 0; i<rows; i++){
        String line = scan.next();
        for(int j = cols-1; j>=0; j--){
          arr[i][j] = line.substring(j, j+1);
        //  System.out.print(arr[i][j]);
        }
      //  System.out.println();
      }
      print(arr);
      System.out.println("Test " +n);
      for(int k = rows-1; k>=0; k--){
        for(int y = 0; y<cols; y++){
          System.out.print(arr[k][y] +" ");
        }
        System.out.println();
      }
    }

  }

  public static void print(String arr[][]){
    for(int i = 0; i<arr.length; i++){
      for(int j = 0; j<arr[0].length; j++){
        System.out.print(arr[i][j] +" ");
      }
      System.out.println();
    }
  }
}
