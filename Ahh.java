import java.util.Scanner; 

public class Ahh {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String jon = scan.nextLine();
    String doctor = scan.nextLine();

    if(jon.length()>=doctor.length()){
      System.out.println("go");
    }

    else {
      System.out.println("no");
    }
  }
}
