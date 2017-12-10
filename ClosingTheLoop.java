import java.util.*;

public class ClosingTheLoop {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int numtest = Integer.parseInt(scan.nextLine());

    for(int i = 1; i<=numtest; i++){
      int ropeLen = Integer.parseInt(scan.nextLine());
      String bag[] = scan.nextLine().split(" ");

      PriorityQueue<Integer> maxBlue = new PriorityQueue<Integer>(new Comparator<Integer> (){
        public int compare(Integer x, Integer y){
          return -1 * x.compareTo(y);
        }
      });
      PriorityQueue<Integer> maxRed = new PriorityQueue<Integer>(new Comparator<Integer> (){
        public int compare(Integer x, Integer y){
          return -1 * x.compareTo(y);
        }
      });

      for(String s: bag){
        if(s.charAt(s.length()-1) == 'R') maxRed.add(Integer.parseInt(s.substring(0,s.length()-1)));
        else maxBlue.add(Integer.parseInt(s.substring(0,s.length()-1)));
      }
      int size = Math.min(maxRed.size(), maxBlue.size());
      int sum = 0;
      if(maxRed.isEmpty() || maxBlue.isEmpty()) System.out.println("Case #" +i+ ": 0");


      else{
        for(int j = 0; j<size; j++){
          sum += maxRed.poll() + maxBlue.poll();
        }
          System.out.println("Case #" +i+ ": " +(sum - 2*size));
      }


       }
    }
  }
