import java.util.Scanner;

public class Peragrams {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.next().toLowerCase();

    int arr[] = new int[26];

    for(int i = 0; i<s.length(); i++){
      int index = getChar(s.charAt(i));
      arr[index]++;
    }

    //for(int c: arr) System.out.print(c +" ");

    //If the string has an odd number of characters the there shoud be 1 odd number of chars and the rest even
    //If the string has an even number of chars then all values in the array shoud be even
    //RACECAR
  //  [2,0,2,0,1,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0]

    if(s.length()%2 == 1){ //ODD LENGTH
      int count = 0;
      for(int i = 0; i<arr.length; i++){
        if(arr[i]%2 == 1 && arr[i] != 0){
          count++;
        }
      }

       if(count>1){
         System.out.println(count-1);
       }

       else {
         System.out.println("0");
       }
    }

    else{
      int count = 0;
      for(int i = 0; i<arr.length; i++){
        if(arr[i]%2 == 1 && arr[i] != 0){
          count++;
        }
      }
      if(count>0)
      System.out.println(count-1);
      else System.out.println(count);
    }


  }

  public static int getChar(char c){
    return (c - 'a');
  }
}
