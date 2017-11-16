import java.util.*;

public class StackingCups {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int num = Integer.parseInt(scan.nextLine());
    String colours[] = new String[num];
    int sizes[] = new int[num];

    for(int i = 0; i<num; i++){
      String line[] = scan.nextLine().split(" ");


      if(line[0].matches("[0-9]*")){
        colours[i] = line[1];
        sizes[i] = (int)(Integer.parseInt(line[0])/2);
      }

      else {
        colours[i] = line[0];
        sizes[i] = Integer.parseInt(line[1]);
      }
    }

    sort(sizes, colours);

    printArray(colours);
  }

  public static void sort(int arr[], String s[]){
    for(int i = 1; i<arr.length; i++){
      for(int j = i-1; j>=0; j--){
        if(arr[j] > arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;

          String t = s[j];
          s[j] = s[j+1];
          s[j+1] = t;


        }
      }
    }
  }

  public static void printArray(String arr[]){
    for(String s: arr){
      System.out.println(s);
    }
  }
}
