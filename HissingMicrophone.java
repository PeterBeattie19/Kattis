import java.util.Scanner;

public class HissingMicrophone {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String s = scan.nextLine();

    if(s.matches(".*ss.*")) System.out.print("hiss");
    else System.out.print("no hiss"); 
  }
}
