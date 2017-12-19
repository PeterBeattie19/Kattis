import java.util.*; 
import java.io.*; 

public class WalrusWeights {
	public static void main (String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		int size = Integer.parseInt(br.readLine()); 

		int weights[] = new int[size]; 

		for(int i = 0; i<size; i++)
			weights[i] = Integer.parseInt(br.readLine()); 

		int target = 2001; 

		System.out.println(knapsack(weights, size, target)); 
	}

  public static int knapsack(int[] W, int numItems, int capacity) {

    boolean[][] possible = new boolean[numItems + 1][capacity + 1];

    
    possible[0][0] = true;

    
    for (int i = 1; i <= numItems; i++) {

      int itemIndex = i - 1;

      // Try going from each column
      for (int j = 0; j <= capacity; j++) {

        
        if (!possible[i - 1][j])
          continue;

        // don't put it in knapsack
        possible[i][j] = true;

        // put in knapsack
        int totalWeight = j + W[itemIndex];
        if (totalWeight <= capacity)
          possible[i][totalWeight] = true;

      }
    }

    // Find best Solution , use offset to approximate, ie: get closest value.
    int offset = 0;
    for (int c = 1000; true; c--) {
      if (possible[numItems][c + offset * 2])
        return c + offset * 2;
      if (possible[numItems][c])
        return c;
      offset++;
    }

  }
} 