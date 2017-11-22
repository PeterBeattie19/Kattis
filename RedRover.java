import java.io.*;
import java.util.*;

public class RedRover {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

        String s = br.readLine(); 


        HashSet<String> checked = new HashSet<String>(); 
        int min = Integer.MAX_VALUE; 

        for(int i = 1; i<=s.length()/3; i++){
            for(int j = 0; j<=s.length()-i; j++){

                String ch = s.substring(j,j+i);

                if(checked.add(ch) == false) continue;
                int count = findCount(s,ch);

                int ans = s.length() - (i*count) + count + i;

                if(ans < min){
                 min = ans;  
                }
            }
        }

        if(min > s.length()) System.out.println(s.length());
        else
        System.out.println(min);
    }

    public static int findCount(String s1, String s2){

        int l1 = s1.length();
        int l2 = s2.length(); 
        int count = 0;

        for(int i = 0; i<=(l1-l2); i++){
            if(s2.matches(s1.substring(i,i+l2))){
             count++;
             i += (l2-1);
            }
        }
        return count; 
    }
}
