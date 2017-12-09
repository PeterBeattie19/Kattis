import java.util.*;

public class ChartingProgress {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String line = " ";
    while(line.matches("") == false){

      ArrayList<StringBuilder> chart = new ArrayList<>();
       line = " ";

      while(line.matches("") == false){
        chart.add(new StringBuilder(line));
        line = scan.nextLine();
      }
      int start = 0;
      for(int i = chart.size()-1; i>=0; i--){
        start = shift(start,chart.get(i));
      }

      Iterator it = chart.iterator();
      while(it.hasNext()) System.out.println(it.next());
      System.out.println();
    }
  }

  public static int shift(int start, StringBuilder s){
    int numStars = 0;
    for(int i = 0; i<s.length(); i++){
      if(s.charAt(i) == '*') {
        numStars++;
        s.setCharAt(i,'.');
      }
    }
    for(int j = 0; j<numStars; j++){
      s.setCharAt(start,'*');
      start++;
    }
    return start;
  }
}
