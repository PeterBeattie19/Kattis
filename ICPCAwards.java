import java.util.*;
public class ICPCAwards{
  public static void main(String[] args) {
    HashSet<String> set = new HashSet<>();
    Scanner scan = new Scanner(System.in);

    int num = Integer.parseInt(scan.nextLine());
    ArrayList<String> scoreBoard = new ArrayList<>();
    int j = 0;

    for(int i = 1; i<=num; i++){
      String s = scan.nextLine();
      String line[] = s.split(" ");

      if(set.add(line[0]) == true){
        scoreBoard.add(s);
        j++;
        if(j==12) break;
      }
    }

    for(String s: scoreBoard){
      System.out.println(s);
    }
  }
}
