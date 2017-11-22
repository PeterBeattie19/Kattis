import java.util.*; 

public class AddingWords {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		Map<String,Integer> map = new HashMap<String,Integer>();
		Map<Integer,String> mapInt = new HashMap<Integer,String>();

		String line[] = scan.nextLine().split(" ");

		while(line[0].matches("clear") == false){
			if(line.length == 3){

				if(map.containsKey(line[1])){
					int temp = map.get(line[1]);
					mapInt.remove(temp); 
				}
				map.put(line[1], Integer.parseInt(line[2])); 
				mapInt.put(Integer.parseInt(line[2]), line[1]); 
			}

			else{
				boolean check = false;
				int result = map.get(line[1]); 
				for(int i = 3; i<line.length-1; i+=2){

					Integer  val = map.get(line[i]); 
					//System.out.println(val);
					if(val == null) {
						printUnknown(line); 
						check = true; 
						break; 
					}
					if(line[i-1].charAt(0) == '+'){
						result += val;
					}
					else{
						result -= val; 
					}
				}
				//System.out.println(result);
				String s = mapInt.get(result);
				if(s==null && check == false) 
					printUnknown(line);
				else if(check == false)
					print(line, s); 
			}

			line = scan.nextLine().split(" ");
		}
	}

	public static void printUnknown(String s[]){
		for(int i = 1; i<s.length; i++){
			System.out.print(s[i] +" "); 
		}
		System.out.println("unknown");
	}

	public static void print(String s[], String s2){
		for(int i = 1; i<s.length; i++){
			System.out.print(s[i] +" ");
		}
		System.out.println(s2); 
	}
}