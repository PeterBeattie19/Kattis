import java.io.*;

public class Statistics {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String line = br.readLine();
    int count = 1;

    while(count<=10 && (line.matches("")==false)){
      String strarr[] = line.split(" ");

      int arr[] = convertToInteger(strarr);


      System.out.print("Case " +count+ ": ");
      int largest = arr[1];
      int smallest = arr[1];
      for(int i = 2; i<arr.length; i++){
        int val = arr[i];
        if(smallest > val) smallest = val;
        if(largest < val) largest = val;
      }

      System.out.println(smallest +" "+ largest +" "+ (largest - smallest));
      count++;
      line = br.readLine();
    }
  }

  public static int[] convertToInteger(String arr[]){
    int res[] = new int[arr.length];
    for(int i = 0; i<arr.length; i++){
      res[i] = Integer.parseInt(arr[i]);
    }
    return res;
  }
}
