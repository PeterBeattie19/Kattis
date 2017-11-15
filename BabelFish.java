import java.util.*;

public class BabelFish {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    HashMap<String, String> dictionary = new HashMap<String, String>();

    String line = scan.nextLine();

    while(!(line.isEmpty())){
      String arr[] = line.split(" ");
      dictionary.put(arr[1], arr[0]);
      line = scan.nextLine();
    }

    while(scan.hasNext()){
      String s = scan.nextLine();
      if(dictionary.containsKey(s)){
        System.out.println(dictionary.get(s));
      }
      else {
        System.out.println("eh");
      }
    }
  }
}
