import java.util.*;
public class Rijeci {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int press = scan.nextInt();

    long arr[] = new long[1000];

    long a = fibMemo(arr, press-1);
    long b = fibMemo(arr, press);

    System.out.println(a +" "+ b);

  }

  public static long fibMemo(long arr[], int n){
    if(arr[n]>0) return arr[n];

    else if(n==0) return 0;

    else if(n==1) return 1;

    else{
      arr[n] = fibMemo(arr,n-1) + fibMemo(arr,n-2);

    }

    return arr[n];
  }
}
