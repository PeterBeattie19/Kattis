import java.io.*;
import java.util.*;

public class BST {
  public static void main(String[] args) throws IOException{
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  TreeMap<Integer, Integer> depths = new TreeMap<>();
  
  
  
        Integer floor, ceil, depth;
        long totalDepth = 0; //running total 

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            Integer newNode = Integer.parseInt(br.readLine());
            
            floor = depths.floorKey(newNode); //parent node if inserted on the right
            ceil = depths.ceilingKey(newNode); //parent node if inserted on the left

            if (floor == null) {
                if (ceil == null) 
                    depth = 0; //Empty tree 
                
                else 
                    depth = depths.get(ceil) + 1; //only ceil has a value 
            } 
            
            else if (ceil == null)
                depth = depths.get(floor) + 1; //only floor has a value
            
            else 
                depth = Math.max(depths.get(floor), depths.get(ceil)) + 1; //the one with the larger depth is where it will be inserted
            
            depths.put(newNode, depth); //store new nodes depth in the map
            totalDepth += depth;
            System.out.println(totalDepth);
        }
  }
}
