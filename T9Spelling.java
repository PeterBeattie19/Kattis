import java.util.*;

public class T9Spelling {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int testCases = Integer.parseInt(scan.nextLine());

    String nums[] = {"2", "22", "222", "3", "33", "333", "4", "44", "444", "5", "55", "555", "6", "66", "666", "7", "77", "777", "7777", "8", "88", "888", "9", "99", "999", "9999"};






    for(int  i = 1; i<=testCases; i++){
      String s = scan.nextLine().toLowerCase();
      System.out.print("Case #" +i+ ": ");
      String prev = "0";

      for(int j = 0; j<s.length(); j++){
        char c = s.charAt(j);
        String val;
        if(c == ' ')
        val = "0";
        else
         val = nums[getInt(s.charAt(j))];

          if(isLike(prev, val)){
            System.out.print(" "+ val);
          }

          else System.out.print(val);
          prev = val;

      }

      System.out.println();
    }


  }



  public static int getInt(char c){
    return c - 'a';
  }

  public static boolean isLike(String s1, String s2){
    char c1 = s1.charAt(0);
    char c2 = s2.charAt(0);

    if(c2 == c1) return true;
    return false;
  }
}
