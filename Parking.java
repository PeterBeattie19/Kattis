import java.util.Scanner;

public class Parking {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int numTest = scan.nextInt();

    for(int j = 1; j<=numTest; j++){
      int size = scan.nextInt();
      int arr[] = new int[size];
      for(int i = 0; i<size; i++){
        arr[i] = scan.nextInt();
      }
      insertionSort(arr);
      int result = 2*diffSum(arr);
      System.out.println(result);
    }
  }

  public static void insertionSort(int arr[]){
    int j;
    for(int i = 1; i<arr.length; i++){
      j = i;
      int temp = arr[j];
      while(j>0 && arr[j-1]>temp){
        arr[j] = arr[j-1];
        --j;
      }
      arr[j] = temp;
    }
  }

  public static int diffSum(int arr[]){
    int sum = 0;
    int size = arr.length;
    for(int i = 1; i<size; i++){
      sum += Math.abs(arr[i]-arr[i-1]);
    }

    return sum;
  }
}
