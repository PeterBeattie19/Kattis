import java.io.*;
import java.util.*;

public class EngineersEnglish {
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Set<String> set = new HashSet<String>();
    String line;

    while((line = br.readLine()) != null){

      String arr[] = line.split(" ");

      if(arr[0].matches("") || arr[0].matches(" ")) break;

      for(String s: arr){
        if(set.add(s.toLowerCase()) == false){
          System.out.print(". ");
        }

        else{
          System.out.print(s +" ");
        }
      }
      System.out.println();
    }
  }
}
