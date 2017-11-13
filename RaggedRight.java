import java.io.*;
import java.util.*;

public class RaggedRight{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    ArrayList<String> paragraph = new ArrayList<String>();

    int largest = 0;
    String line = "  ";
    while(line.charAt(line.length()-1) != '.'){
      line = br.readLine();

      paragraph.add(line);

      if(line.length() > paragraph.get(largest).length()){
        largest = paragraph.size() - 1;
      }
    }

    String l = paragraph.get(largest);
    int sum = 0;

    for(int i = 0; i<paragraph.size()-1; i++){
      int diff = l.length() - paragraph.get(i).length();
      sum += (int)Math.pow(diff, 2);
    }

    System.out.println(sum);
  }
}
