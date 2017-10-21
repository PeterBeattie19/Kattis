import java.util.*;

  //Experiment to see weather it is faster to use your own array sorting method or java's own Arrays.sort() method
  //Conclusion: It is better to use your own method 
public class FasterSort {
  public static void main(String[] args) {
    //Scanner scan = new Scanner(System.in);
    int size = 100;
    int arr1[] = new int[size];
    int arr2[] = new int[size];

    Random ran = new Random();

    for(int i = 0; i<size; i++){
      arr1[i] = ran.nextInt(1000);
      arr2[i] = ran.nextInt(1000);
    }

    long start1 = System.currentTimeMillis();
    quickSort(arr1, 0, size-1);
    long end1 = System.currentTimeMillis();

    long start2 = System.currentTimeMillis();
    Arrays.sort(arr2);
    long end2 = System.currentTimeMillis();

    System.out.println("Time for custom sort method " +(end1-start1));
    System.out.println("Time for java Arrays sort method " +(end2-start2));
  }

  /*-------QUICK SORT-------*/
  public static void quickSort(int arr[], int low, int high){
    int pivot = arr[low + (high-low)/2];
    int i = low;
    int j = high;

    while(i<=j){

      while(arr[i]<pivot){
        i++;
      }

      while(arr[j]>pivot){
        j--;
      }

      if(i<=j){
        swap(i,j,arr);
        i++;
        j--;
        //print();
      }
    }

    if(low < j){
      quickSort(arr, low, j);
    }

    if(high>i){
      quickSort(arr, i, high);
    }
  }

  public static void swap(int n1, int n2, int arr[]){
    int temp = arr[n1];
    arr[n1] = arr[n2];
    arr[n2] = temp;
}

}
