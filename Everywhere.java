import java.util.*;
public class Everywhere {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int testCases = scan.nextInt();

    for(int i = 1; i<=testCases; i++){
      int numCities = scan.nextInt();
      HashSet<String> set = new HashSet<String>();
      for(int j = 1; j<=numCities; j++){
        String line = scan.next();
        set.add(line);
      }
      System.out.println(set.size());
    }
  }
}
