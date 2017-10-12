import java.util.Scanner;

public class Apaxian {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String name = scan.nextLine();

    System.out.println(removeRepeats(name));  

  }

  public static String removeRepeats(String s){
    String newStr = "";
    String prev = s.substring(0,1);
    newStr = newStr + prev;

    for(int i = 1; i<s.length(); i++){
      if(!(s.substring(i,i+1).matches(prev))){
        newStr = newStr + s.substring(i,i+1);
        prev = s.substring(i,i+1);
      }
    }

    return newStr;
  }
}
