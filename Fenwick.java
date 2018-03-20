import java.util.*; 
import java.io.*; 


public class Fenwick{
	public static void main (String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		String line[] = br.readLine().split(" "); 

		int n = Integer.parseInt(line[0]); 
		int q = Integer.parseInt(line[1]); 



		FenwickTree tree = new FenwickTree(n); 

		for(int i = 0; i<q; i++){
			line = br.readLine().split(" "); 
			char c = line[0].charAt(0); 

			int val = Integer.parseInt(line[1]); 

			if(c=='+'){
				int u = Integer.parseInt(line[2]); 

				tree.update(val,u); 
			}

			else{
				System.out.println(tree.query(val)); 
			}
		}
	}

public static class FenwickTree {

    private long[] tree;
    private int n;

    public FenwickTree(int n) {
        this.tree = new long[n + 1];
        this.n = n;
    }

    public long query(int index) {
        index--;
        if (index == -1) {
            return 0;
        }
        long sum = tree[0];
        while (index > 0) {
            sum += tree[index];
            index -= (index & -index);
        }
        return sum;
    }

    public void update(int index, long delta) {
        if (index == 0) {
            tree[0] += delta;
        } 
        else{
            while (index <= n) {
                tree[index] += delta;
                index += (index & -index);
            }
        }
    }
}

}
