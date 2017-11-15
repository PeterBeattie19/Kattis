import java.io.*;

public class WhatDoesTheFoxSay {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    for(int i = 1; i<=n; i++) {
    String arr[] = br.readLine().split(" ");

    while(true){
    //  String line = br.readLine();
      String words[] = br.readLine().split(" ");

      if(words.length > 3) break;

      remove(words[2], arr);
    //  line = br.readLine();
    }

    remaining(arr);
    //System.out.println();
  }
}

  public static void remove(String s, String arr[]){
    for(int i = 0; i<arr.length; i++){
      if(arr[i].matches(s)){
        arr[i] = "-1";
        //return;
      }
    }
  }

  public static void remaining(String arr[]){
    String n = "";
    for(String s: arr){
      if(s.matches("-1") == false) System.out.print(s +" ");
    }
  }
}
