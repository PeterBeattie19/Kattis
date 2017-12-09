import java.util.*;

public class BattleSimulation {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String attack = scan.nextLine();

    for(int i = 0; i<attack.length(); i++){
      if(i <= attack.length()-3){
        if(combo(attack.substring(i,i+3))){
          System.out.print("C");
          i += 2;
          continue;
        }
      }
       if(attack.charAt(i) == 'R')
        System.out.print("S");

      else if(attack.charAt(i) == 'B')
        System.out.print("K");

      else if(attack.charAt(i) == 'L')
        System.out.print("H");
    }
  }

  public static boolean combo(String s){
    return (s.matches("RBL") || s.matches("RLB") || s.matches("BLR") || s.matches("BRL") || s.matches("LRB") || s.matches("LBR"));
  }
}
