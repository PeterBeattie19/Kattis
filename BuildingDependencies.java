import java.util.*;
import java.io.*;

class BuildDependencies {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int numFiles = Integer.parseInt(br.readLine());

    HashMap<String, ArrayList<String>> map = new HashMap<>();

    for(int i = 0; i<numFiles; i++){
      String s[] = br.readLine().split(" ");

      String file = s[0].substring(0,s[0].length()-1);
      if(map.containsKey(file) == false){
        map.put(file, new ArrayList<>());
      }


      for(int j = 1; j<s.length; j++){
        if(map.containsKey(s[j]) == false){
          map.put(s[j],new ArrayList<>());
          map.get(s[j]).add(file);
        }

        else
          map.get(s[j]).add(file);
      }
    }

    String recomp = br.readLine();
    ArrayList<String> list = new ArrayList<>();
      HashSet<String> visited = new HashSet<>();
    dfs(map,recomp,visited, list);



      

    for(int i = list.size()-1; i>=0; i--)
      bw.write(list.get(i)+"\n");
    bw.flush();


  }


  public static void dfs(HashMap<String, ArrayList<String>> map, String s , HashSet<String> visited ,ArrayList<String> list){
    visited.add(s); 

    for(String v: map.get(s)){
      if(visited.contains(v)==false){
        dfs(map,v,visited,list); 
      }
    }

    list.add(s); 
  }
}
