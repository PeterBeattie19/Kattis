import java.util.*;

public class NarrowArtGallert{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int k = scan.nextInt();

    while(n!=0 && k!=0){
      int arr[][] = new int[n][2];
      boolean b[][] = new boolean[n][2];
      PriorityQueue<Integer> q = new PriorityQueue<>();
      for(int i = 0; i<n; i++){
        for(int j = 0; j<2; j++){
          int t = scan.nextInt();
          if(i!=0 || i!=n-1) q.add(t);
          arr[i][j] = t;
        }
      }

      for(int i = 0; i<k; i++){
        int temp = q.poll();
        mark(b, arr, temp); //Mark so long as it is false else move on
      }

      boolean check = false;
      while(true){
        if(checkSolution(b,arr) == true){
          break;
        } //Return true if valid else return false and unmark entries causing issues
        int temp = q.poll();
        mark(b, arr, temp);
      }

      System.out.println(sum(arr,b));
      n = scan.nextInt();
      k = scan.nextInt(); 
    }
  }


public static void mark(boolean b[][], int arr[][], int x){
  for(int i = 0; i<b.length-1; i++){
    for(int j = 0; j<2; j++){
      if(arr[i][j] == x && b[i][j] == false){
        b[i][j] = true;
        return;
      }
    }
  }
}

public static boolean checkSolution(boolean b[][], int arr[][]){
    for(int i = 1; i<b.length-1; i++){
      for(int j = 0; j<2; j++){
        if(j==0 && b[i][j] == true){
          int numproblems = 0;
          if(b[i][j+1] == true) numproblems++;
          if(b[i+1][j+1] == true) numproblems++;

          if(numproblems==1){
            if(arr[i][j] == arr[i][j+1]){
              if(b[i+1][j] == true) b[i][j] = false;
            }
            else if(arr[i][j] > arr[i][j+1]) b[i][j+1] = false;
            else b[i][j] = false;
            return false;
          }

          else if(numproblems==2){
            if(arr[i][j]==arr[i][j+1] && arr[i][j] == arr[i+1][j]) b[i][j] = false;

            else if(arr[i][j] < arr[i][j+1] && arr[i][j] < arr[i+1][j]) b[i][j] = false;
            else if(arr[i][j] > arr[i][j+1] && arr[i][j] > arr[i+1][j]){
              if(arr[i][j+1] > arr[i+1][j+1] ) b[i+1][j+1] = false;
              else b[i][j+1] = false;
            }
            return false;
          }

        }

        else if(j==1 && b[i][j] == true){
          int numproblems = 0;
        //  if(b[i][j+1] == true) numproblems++;
          if(b[i+1][j-1] == true) numproblems++;

          if(numproblems==1){

            if(arr[i][j] == arr[i][j-1]){
              b[i+1][j-1] = false;
            }
            else if(arr[i][j] > arr[i+1][j-1]) b[i+1][j-1] = false;
            else b[i][j] = false;
              return false;
          }

        }
      }
    }
    return true

    ;
}


public static int sum(int arr[][], boolean b[][]){
  int sum = 0;
  for(int i = 0; i<arr.length; i++){
    for(int j = 0; j<2; j++){
      if(b[i][j] == false) sum += arr[i][j];
    }
  }
  return sum;
}
}
