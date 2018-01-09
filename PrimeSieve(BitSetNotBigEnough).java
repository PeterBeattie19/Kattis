import java.util.*; 
import java.io.*; 

public class PrimeSieve {
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

        String line[] = br.readLine().split(" "); 

        int cap = Integer.parseInt(line[0]); 
        int q = Integer.parseInt(line[1]);
        cap++; 

        BitSet primes = new BitSet(cap); 
        primes.flip(0,cap); 

        primes.set(1,false);
    //  primes.set(cap)

        for(int i = 2; i<cap; i++){
            if(primes.get(i) == true){
                for(int j = i*i; j<cap; j+=i){
                    primes.set(j,false); 
                }
            }
        }
        int count = 0; 

        for(int i = 1; i<cap; i++)
            if(primes.get(i) == true)
                count++;

        System.out.println(count); 

        for(int i = 0; i<q; i++){
            int val = Integer.parseInt(br.readLine()); 

            if(primes.get(val) == true)
                System.out.println("1");
            else
                System.out.println("0"); 
        }
    }
} 
