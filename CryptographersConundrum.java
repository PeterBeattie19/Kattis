import java.util.Scanner;

public class CryptographersConundrum {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String s = scan.nextLine();

    char arr[] = {'P','E','R'};
    int index = 0;

    int count = 0;
    for(int i = 0; i<s.length(); i++){
      if(!(s.charAt(i)==arr[index])){
        count++;
      
      }

      if(index==2) index = 0;
      else index++;
    }

    System.out.print(count);
  }
}
