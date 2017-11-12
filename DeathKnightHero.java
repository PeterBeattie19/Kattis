import java.io.*;

public class DeathKnightHero {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int num = Integer.parseInt(br.readLine());
    int wins = 0;

    for(int i = 1; i<=num; i++){
      String line = br.readLine();

      if(line.matches(".*CD.*") == false){
        wins++;
      }
    }

    System.out.println(wins);
  }
}
