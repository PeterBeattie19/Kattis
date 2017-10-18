import java.util.Scanner;

public class OneChickenPerPerson {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int people = scan.nextInt();
    int chicken = scan.nextInt();

    int sub = chicken  - people;

    if(sub>=0){
      if(sub==1)
      System.out.println("Dr. Chaz will have " +sub+ " piece of chicken left over!");
      else System.out.println("Dr. Chaz will have " +sub+ " pieces of chicken left over!");
    }

    else {
      if(sub==-1)
      System.out.println("Dr. Chaz needs " +Math.abs(sub)+ " more piece of chicken!");
      else System.out.println("Dr. Chaz needs " +Math.abs(sub)+ " more pieces of chicken!");
    }
  }
}
