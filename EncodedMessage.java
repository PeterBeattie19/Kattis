import java.util.*;
public class EncodedMessage {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int testCases = scan.nextInt();

    for(int i = 0; i<testCases; i++){
      String line = scan.next();
      String arr[][] = decrypt(toArray(line));
      print(arr);
    }

  }

  public static String[][] decrypt(String arr[][]) {
    int length = arr.length;
    String ret[][] = new String[length][length];

    int row = 0;
    int col = 0;

    for(int i = length-1; i>=0; i--){
      for(int j = 0; j<length; j++){
        ret[row][col] = arr[j][i];
        col++;
      }
      col = 0;
      row++;
    }

    return ret;
  }

  public static String[][] toArray(String s){
    int size = (int)Math.sqrt((int)s.length());
    String arr[][] = new String[size][size];
    int count = 0;

    for(int i = 0; i<size; i++){
      for(int j = 0; j<size; j++){
        arr[i][j] = s.substring(count,count+1);
        count++;
      }
    }
    return arr;
  }

  public static void print(String arr[][]){
    for(int i = 0; i<arr.length; i++){
        for(int j = 0; j<arr.length; j++){
          System.out.print(arr[i][j]);
        }
      }
      System.out.println();
  }
}
