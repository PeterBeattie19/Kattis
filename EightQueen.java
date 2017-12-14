import java.util.*;
import java.io.*;

public class EightQueen {
  public static void main(String[] args) throws IOException{
  //  Scanner scan = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    char board[][] = new char[8][8];
    int count = 0;


    for(int i = 0; i<8; i++){
      //String line = scan.nextLine();
      String line = br.readLine();
      for(int j = 0; j<8; j++){
        board[i][j] = line.charAt(j);
      }
    }

    boolean rows[] = new boolean[8];
    boolean cols[] = new boolean[8];
    boolean left[] = new boolean[15];
    boolean right[] = new boolean[15];

    boolean invalid = false;
    for(int i = 0; i<8; i++){
      for(int j = 0; j<8; j++){
        if(board[i][j] == '*'){
          count++;
          if(rows[i] || cols[j] || left[i+j] || right[i-j+7]){
            System.out.println("invalid");
            return;
          }
          else{
            rows[i] = true;
            cols[j] = true;
            left[i+j] = true;
            right[i-j+7] = true;
          }
        }
      }
    }
    if(count == 8)
      System.out.println("valid");
    else
      System.out.println("invalid"); 
  }
}
