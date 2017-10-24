import java.io.*;

public class CD {
  public static void main(String[] args) throws IOException{
    //Scanner scan = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line[];
    int n1;
    int m1;

    while(true){
      String s = "";
      s = br.readLine();
     line = s.split(" ");
     n1 = Integer.parseInt(line[0]);
     m1 = Integer.parseInt(line[1]);

    if(n1==0 && m1==0) break;

    int n[] = new int[n1];
    int m[] = new int[m1];

    for(int i = 0; i<n1; i++){
      n[i] = Integer.parseInt(br.readLine());
    }

    for(int i = 0; i<m1; i++){
      m[i] = Integer.parseInt(br.readLine());

    }

    int j = 0, k = 0, count = 0;

    while(j<n1 && k<m1){
      if(n[j] < m[k]){
        j++;
      }

      else if(n[j] > m[k]){
        k++;
      }

      else {
        j++;
        k++;
        count++;
      }
    }
    System.out.println(count);

  }



  }
}
