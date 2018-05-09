import java.util.*; 
import java.io.*; 


public class Boggle{

	public static HashSet<String> set = new HashSet<>(); 

	public static void main (String args[]) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		HashSet<String> dict = new HashSet<>(); 
		Node trie = new Node(); 

		int dictSize = Integer.parseInt(br.readLine());

		String line = ""; 

		for(int i = 0; i<dictSize; i++){
			line = br.readLine().toLowerCase(); 
			dict.add(line);
			trie.add(line,0);
		}
		   
		line = br.readLine(); 

		int numBoggleBoards = Integer.parseInt(br.readLine());



		for(int t = 0; t<numBoggleBoards; t++){
			int n = 4; 
			String board[] = new String[n]; 
			int visited[][] = new int[n][n]; 


			PriorityQueue<String> q = new PriorityQueue<>(new Comparator<String>() {
				public int compare(String x, String y) {
					if(y.length() == x.length())
						return x.compareTo(y); 
					return y.length() - x.length(); 
				}
			});

			for(int i = 0; i<n; i++)
				board[i] = br.readLine().toLowerCase(); 

			line = br.readLine(); 

			for(int i = 0; i<n; i++){
				for(int j = 0; j<n; j++){
					dfs(i,j, "",board,dict,visited,q,trie); 
					set(visited); //Reset visited to zero.
				}
			}

			int total = 0; 
			for(String ans: set){
				if(ans.length() == 3 || ans.length() == 4)
					total++; 
				if(ans.length() == 5)
					total+=2;
				if(ans.length() == 6)
					total+=3;

				if( ans.length() == 7)
					total+=5;

				if( ans.length() == 8)
					total+=11;	
			}

			System.out.println(total +" "+ q.peek().toUpperCase() +" "+ set.size()); 
			set.clear();
		}
	}

	public static void set(int arr[][]){
		for(int i = 0; i<arr.length; i++)
			for(int j = 0; j<arr.length; j++)
				arr[i][j] = 0; 
	}

	public static void dfs(int i, int j, String s,String board[], HashSet<String> dict, int visited[][], PriorityQueue<String> q, Node trie){

		s += board[i].substring(j,j+1); 
		if(dict.contains(s)){
			q.add(s);
			set.add(s); 
		}

			visited[i][j] = 1;

			if(trie.findCount(s,0) != 0){ //if no words start with the prefix s then there is no need to recurse 

			if((i-1)>=0  && visited[i-1][j]==0)
				dfs(i-1,j,s,board,dict,visited,q,trie);

			if((i+1)<board.length  && visited[i+1][j]==0)
				dfs(i+1,j,s,board,dict,visited,q,trie);

			if((j-1)>=0 && visited[i][j-1]==0)
				dfs(i,j-1,s,board,dict,visited,q,trie);

			if((j+1)<board.length && visited[i][j+1]==0)
				dfs(i,j+1,s,board,dict,visited,q,trie);

			if((i-1)>=0 && (j+1)<board[i].length() && visited[i-1][j+1]==0)
				dfs(i-1,j+1,s,board,dict,visited,q,trie);

			if((i-1)>=0 && (j-1)>=0 && visited[i-1][j-1]==0)
				dfs(i-1,j-1,s,board,dict,visited,q,trie);

			if((i+1)<board.length && (j-1)>=0 && visited[i+1][j-1]==0)
				dfs(i+1,j-1,s,board,dict,visited,q,trie);

			if((i+1)<board.length  && (j+1)<board[0].length() && visited[i+1][j+1]==0)
				dfs(i+1,j+1,s,board,dict,visited,q,trie);
			}

		visited[i][j] = 0; //Reset the path taken.
	}

public static class Node {
  private int numOfChars = 26;
  Node children[] = new Node[numOfChars];
  int size = 0;

  public void add(String s, int index){
     size++;
     if(index == s.length()) return;

     int intVal = toInt(s.charAt(index));
     Node child = children[intVal];

     if(child==null){
       child = new Node();
       children[intVal] = child; 
     }

     child.add(s, index+1);
  }

  public int findCount(String s, int index){ //returns how many words start with the prefix s. 
    if(index == s.length()) return size;

    Node child = children[toInt(s.charAt(index))];  

    if(child == null){
      return 0;
    }

    return child.findCount(s, index + 1);
  }

  public int toInt(char c){
    return (c - 'a');
  }
}

} 