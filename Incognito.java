import java.util.*;
import java.io.*;

public class Incognito {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int num = Integer.parseInt(br.readLine());

    for(int n = 0; n<num; n++){
      int size = Integer.parseInt(br.readLine());
      String line[];
      HashSet<String> arr = new HashSet<>();
      HashMap<String, Integer> map = new HashMap<>();

      for(int i = 0; i<size; i++){
        line = br.readLine().split(" ");
        arr.add(line[1]);
        if(map.containsKey(line[1]) == false){
          map.put(line[1], 1);
        }
        else{
          int x = map.get(line[1]) + 1;
          map.put(line[1],x);
        }
      }

      int sum = 1;

      for(String s: arr){
        sum *= map.get(s) + 1;
      }
      System.out.println(sum-1);
    }

  }
}
