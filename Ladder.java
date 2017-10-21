import java.util.Scanner;

public class Ladder{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double h = scan.nextDouble();
    double v = scan.nextDouble();

    double cosine = Math.sin((double)(v*(Math.PI/180)));

    int ladder = (int)Math.ceil(((double)h/cosine));
    //System.out.println(Math.cos(70));

    System.out.println(ladder);
  }
}
