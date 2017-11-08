import java.util.*;

public class EraseSecurely {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int N = scan.nextInt();
    String s1 = scan.next();

    String s2 = scan.next();

    for(int i = 1; i<=N; i++) s1 = complement(s1);


    if(s1.matches(s2)){
      System.out.println("Deletion succeeded");
    }

    else {
      System.out.println("Deletion failed");
    }
  }

  public static String complement(String s){
    String ret = "";

    for(int i = 0; i<s.length(); i++){
      if(s.charAt(i) == '0') ret = ret + '1';
      else ret = ret + '0';
    }
    return ret;
  }
}
