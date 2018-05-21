import java.util.*; 

public class TravellingSalesMan{
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in); 

        ArrayList<Node> graph = new ArrayList<>();
        double t = scan.nextDouble();  

        for(int i = 0; i<(int)t; i++){
            graph.add(new Node(scan.nextDouble(), scan.nextDouble(), i)); 
        }


        HashSet<Node> visited = new HashSet<>(); 
        ArrayList<Node> solution = new ArrayList<>(); 
        Node current = graph.get(0); 
        visited.add(current); 
        solution.add(current); 

        for(int i = 0; i<t; i++){
            double sml = Double.POSITIVE_INFINITY; 
            Node smallest = current; 
            for(Node n: graph){
                //if(current.equal(n))
                    //continue;

                if((visited.contains(n) == false) && current.dist(n) < sml && current.equal(n)==false){
                    sml = current.dist(n); 
                    smallest = n; 
                }
                //System.out.println(n.x +" "+ n.y);
            }

            solution.add(smallest); 
            visited.add(smallest); 

            current = smallest; 
        }

        for(Node n: solution)
            System.out.println(n.key); 
    }

    public static class Node {
        double x;
        double y; 
        int key;

        public Node(double x, double y, int k){
            this.x = x;
            this.y = y; 
            this.key = k; 
        }

        public boolean equal(Node n){
            if(n.x == this.x && n.y == this.y)
                return true; 

            return false; 
        }

        public double dist(Node n){
            double diffX = Math.abs(n.x - this.x);
            double diffY = Math.abs(n.y - this.y); 
            diffX *= diffX;
            diffY *= diffY; 

            return Math.sqrt(diffY + diffX); 
        }
    }
} 
