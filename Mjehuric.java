import java.io.*;

public class Mjehuric {
  public static void main(String[] args) throws IOException{
  //  Scanner scan = new Scanner(System.in);

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String line[] = br.readLine().split(" ");
    int arr[] = new int[5];

    for(int i = 0; i<5; i++){
      arr[i] = Integer.parseInt(line[i]);
    }

    sort(arr);
  }

  public static void sort(int arr[]){
      for(int i = 1; i<arr.length; i++){
        for(int j = i-1; j>=0; j--){
          if(arr[j] > arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
            print(arr);
          }
        }
      }
  }


  public static void print(int arr[]){
    for(int i: arr){
      System.out.print(i +" ");
    }

    System.out.println();
  }
}
