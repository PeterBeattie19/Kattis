import java.util.*;

public class Kemija {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    String arr[] = scan.nextLine().split(" ");

    for(int i = 0; i<arr.length; i++){
      String s = arr[i];
      String news = "";

      for(int j = 0; j<s.length(); j++){
        if(isVowel(s.charAt(j))){
          news = news + s.substring(j,j+1);
          j+= 2;
        }
        else {
          news = news + s.substring(j,j+1);
        }
      }
      System.out.print(news +" ");
    }

  }

  public static boolean isVowel(char c){
    char arr[] = {'a', 'o', 'u', 'i', 'e'};
    for(int i = 0; i<5; i++){
      if(c == arr[i]) return true;
    }
    return false;
  }
}
