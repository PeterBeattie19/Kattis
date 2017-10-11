import java.util.Scanner;

public class Cudoviste {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int rows = scan.nextInt();
    int cols = scan.nextInt();

    String arr[][] = new String[rows][cols];

    for(int i = 0; i<rows; i++){
      String temp = scan.next();
      for(int j = 0; j<cols; j++){
        arr[i][j] = temp.substring(j,j+1);
      }
    }

    int zerocar = 0;
    int onecar = 0;
    int twocar = 0;
    int threecar = 0;
    int fourcar = 0;

    for(int i = 0; i<rows-1; i++){
      for(int j = 0; j<cols-1; j++){
        if(canPark(arr,i,j)){
          int temp = countCarCrush(arr, i, j);
          if(temp==0) zerocar++;
          if(temp==1) onecar++;
          if(temp==2) twocar++;
          if(temp==3) threecar++;
          if(temp==4) fourcar++;
        }
      }
    }

    System.out.println(zerocar);
    System.out.println(onecar);
    System.out.println(twocar);
    System.out.println(threecar);
    System.out.println(fourcar);
  }

  public static boolean canPark(String arr[][], int i, int j){ //i and j denote the top top ledt corner of a possible space

    if(arr[i][j].matches("#")) {
      return false;
    }

    else if(arr[i][j+1].matches("#")) {
      return false;
    }

    else if(arr[i+1][j].matches("#")) {
      return false;
    }

    else if(arr[i+1][j+1].matches("#")) {
      return false;
    }

    return true;
  }

  public static int countCarCrush(String arr[][], int i, int j){
    int count = 0;

    if(arr[i][j].matches("X")) {
      count++;
    }

     if(arr[i][j+1].matches("X")) {
      count++;
    }

     if(arr[i+1][j].matches("X")) {
      count++;
    }

     if(arr[i+1][j+1].matches("X")) {
      count++;
    }

    return count;

  }
}
