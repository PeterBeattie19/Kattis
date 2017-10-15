import java.util.Scanner;
public class Skener {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int r = scan.nextInt();
    int c = scan.nextInt();
    int zr = scan.nextInt();
    int zc = scan.nextInt();

    int count = 0;

    String arr[][] = new String[r*zr][c*zc];
    String line = "";
    String value = "";


    for(int i = 0; i<(r*zr); i++){
      if(i%zr==0){
         line = scan.next();
         value = line.substring(0,count+1);
      }

      for(int j = 0; j<(c*zc); j++){
        if(j%zc==0 && j!=0) {
          count++;
          value = line.substring(count, count+1);
        }
        arr[i][j] = value;
      }

      count = 0;
    }
    System.out.println();
    System.out.println();
    System.out.println();
    
    print(arr);
  }

  public static void print(String arr[][]){
    for(int i = 0; i<arr.length; i++){
      for(int j = 0; j<arr[0].length; j++){
        System.out.print(arr[i][j]);
      }
      if(i!=arr.length-1)
      System.out.println();
    }
  }
}
