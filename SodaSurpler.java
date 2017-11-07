import java.util.*;

public class SodaSurpler {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int neb = scan.nextInt() + scan.nextInt();
    int cost = scan.nextInt();

    int count = 0;

    while(cost <= neb){
      count += neb/cost;

      if(neb%cost == 0) neb = neb/cost;
      else neb = ((neb/cost) + (neb%cost));
    }

    System.out.println(count);
  }
}
