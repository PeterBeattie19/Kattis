import java.util.*;

public class DiceCup {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int m = scan.nextInt();

    int helper[] = new int[(n+m)+1];

    for(int i = 1; i<=n; i++){
      for(int j = 1; j<=m; j++){
        int result = i + j;
        helper[result]++;
      }
    }

    int largest = 0;

    for(int i = 1; i<helper.length; i++){
      if(helper[i] > largest) largest = helper[i];
    }

    for(int i = 1; i<helper.length; i++){
      if(helper[i] == largest) System.out.println(i);
    }
  }
}
