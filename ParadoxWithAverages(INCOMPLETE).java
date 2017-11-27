import java.io.*;
import java.util.*;

public class ParadoxWithAverages {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
  //  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int tests = scan.nextInt();

    for(int i = 1; i<=tests; i++){
      int numcs = scan.nextInt();
      int numec = scan.nextInt();

      ArrayList<Integer> ecstudent = new ArrayList<Integer>();
      ArrayList<Integer> csstudents = new ArrayList<Integer>();

      PriorityQueue<Integer> max = new PriorityQueue<Integer>(new Comparator<Integer> (){
        public int compare(Integer x, Integer y){
          return -1 * x.compareTo(y);
        }
      });

      for(int j = 0; j<numcs; j++){
        int val = scan.nextInt();
        max.add(val);
        csstudents.add(val);
      }

      int largestIQ = -1;
      for(int j = 0; j<numec; j++){
        int val = scan.nextInt();
        ecstudent.add(val);
        if(val>largestIQ) largestIQ = val;
      }

      if(largestIQ < max.peek()){
        System.out.print("1");
        break;
      }

      double avgc = -1;
      double avge = -5;
      int count = 0;

      while(avgc != avge){
        int pop = max.poll();
        csstudents.remove(pop);
        ecstudent.add(pop);
        avgc = average(csstudents);
        avge = average(ecstudent);
        count++;
      }
      System.out.println(count);
    }
  }

  public static double average(ArrayList<Integer> arr){
    double sum = 0;

    for(int i: arr){
      sum += i;
    }
    return sum/(double)arr.size();
  }
}
