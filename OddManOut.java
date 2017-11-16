import java.util.*;
import java.io.*;

public class OddManOut {
  public static void main(String[] args) throws IOException{
    Scanner scan = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(scan.nextLine());

    for(int i = 1; i<=n; i++){
      int v = Integer.parseInt(scan.nextLine());
      HashSet<String> guests = new HashSet<String>();
      String num[] = scan.nextLine().split(" ");

      for(int j = 0; j<v; j++){


        if(guests.add(num[j]) == false){
          guests.remove(num[j]);
        }
      }

      System.out.print("Case #" +i+ ": "); 
      Iterator it = guests.iterator();
      System.out.println(it.next());
    }
  }
}
