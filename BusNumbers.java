import java.util.*;

public class BusNumbers {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
  //  Random ran = new Random();
    int size = scan.nextInt();
  //  int arr[] = new int[size];
  //  int size = 1000;
    int helper[] = new int[1002];
    int largestIndex = 0;

    for(int i = 0; i<size; i++){
      int val = scan.nextInt();
    //  int val = ran.nextInt(1000);
      helper[val]++;

      if(largestIndex<val) largestIndex = val;
    }

  //  System.out.println(largestIndex);

    for(int i = 1; i<=largestIndex; i++){
      if(helper[i]!=0){
      //  System.out.println("First cond");
        int count = 0;
        int index = 0;
        for(int j = i+1; helper[j]!=0; j++){
          count++;
          index = j;
        }
        if(count>1){
          System.out.print(i +"-"+ index +" ");
          i = index;
        }
        else {
          System.out.print(i +" ");
        }
      }
    }
  }
}
