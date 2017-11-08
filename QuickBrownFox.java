import java.util.*;

public class QuickBrownFox {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    char charArr[] = {'a' , 'b', 'c', 'd', 'e', 'f' , 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    int numOfTests = Integer.parseInt(scan.nextLine());

    for(int i = 1; i<=numOfTests; i++){
      String s = scan.nextLine().toLowerCase(); //String to be queried

      int arr[] = new int[26]; //Helper Array

      for(int j = 0; j<s.length(); j++){ //Loop through String

        int val = getInt(s.charAt(j));
        if(val != -1)
        arr[val]++;
      }

      String res = "";
      for(int k = 0; k<arr.length; k++){
        if(arr[k] == 0) res = res + getChar(k, charArr);
      }

      if(res.length() == 0) System.out.println("pangram");
      else System.out.println("missing " +res);

    }

  }

  public static int getInt(char c){
    int val = (c - 'a');
    if(val>=0 && val<=25)
    return (c - 'a') ;

    else return -1;
  }

  public static char getChar(int i, char arr[]){
    return (arr[i]);
  }
}
