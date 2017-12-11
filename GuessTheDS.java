import java.util.*;

public class GuessTheDS {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer> (){
      public int compare(Integer x, Integer y){
        return -1 * x.compareTo(y);
      }
    });
    LinkedList<Integer> stack = new LinkedList<>();
    LinkedList<Integer> queue = new LinkedList<>();

    while(scan.hasNext()){
      int n = scan.nextInt();
      boolean isStack = true;
      boolean isQueue = true;
      boolean isPQ = true;
      int command = 0;
      int value = 0;

      for(int i = 1; i<=n; i++){
        command = scan.nextInt();
        value = scan.nextInt();

        if(command == 1){
          if(isPQ) pq.add(value);
          if(isStack) stack.push(value);
          if(isQueue) queue.add(value);
        }

        else{

          try{
            if(isPQ)
            if(pq.isEmpty() || value != pq.poll()) isPQ = false;
          }
          catch(NullPointerException e){
            isPQ = false;
            continue;
          }

          try{
          if(isStack)
            if(stack.isEmpty() || value != stack.pop()) isStack = false;
          }
          catch(NullPointerException e){
            isStack = false;
            continue;
          }

          try{
          if(isQueue)
            if(queue.isEmpty() || value != queue.poll()) isQueue = false;
          }
          catch(NullPointerException e){
            isQueue = false;
            continue;
          }


        }


      }

      if(isStack==true && isQueue==false && isPQ==false) System.out.println("stack");
      else if(isStack==false && isQueue==true && isPQ==false) System.out.println("queue");
      else if(isStack==false && isQueue==false && isPQ==true) System.out.println("priority queue");

      else if(isStack==false && isQueue==false && isPQ==false) System.out.println("impossible");

      if(isStack==true && isQueue==true && isPQ==false) System.out.println("not sure");
      else if(isStack==true && isQueue==false && isPQ==true) System.out.println("not sure");
      else if(isStack==false && isQueue==true && isPQ==true) System.out.println("not sure");
      else if(isStack==true && isQueue==true && isPQ==true) System.out.println("not sure");

      pq.clear();
      queue.clear();
      stack.clear();
    }
  }
}
