import java.util.*; 
import java.io.*; 

public class ConvexHull_Jarvis {
	public static void main (String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		int numPoints = Integer.parseInt(br.readLine()); 
		String line[]; 

		while(numPoints != 0){
			Point points[] = new Point[numPoints];

			for(int i = 0; i<numPoints; i++){
				line = br.readLine().split(" "); 
				points[i] = new Point(Integer.parseInt(line[0]) , Integer.parseInt(line[1])); 
			}

			convexHull(points, numPoints); //Prints points in the method

			numPoints = Integer.parseInt(br.readLine()); 
		}

	}

	public static class Point {
		int x;
		int y;

		public Point(int x, int y){
			this.x = x;
			this.y = y;
		}
	}

	public static int orientation(Point p, Point q, Point r){
  		int val = (q.y - p.y) * (r.x - q.x) - (q.x - p.x) * (r.y - q.y);

  		if(val == 0) 
  			return 0;

  		return (val > 0)? 1: 2;
	}

	public static void convexHull(Point points[], int n){
		if(n < 3){
			if(n == 1){
				System.out.println("1"); 
				System.out.println(points[0].y +" "+ points[0].x);
				//System.out.println(); 
				return;
			}

			if(points[0].x == points[1].x && points[0].y == points[1].y){
				System.out.println("1"); 
				System.out.println(points[0].y +" "+ points[0].x);
				return; 
			}

			if(points[0].x == points[1].y && points[1].x == points[0].y){
			System.out.println("2");
			System.out.println(points[0].x +" "+ points[0].y);
			System.out.println(points[1].x +" "+ points[1].y);
			return; 
			}
			System.out.println("2");
			System.out.println(points[0].y +" "+ points[0].x);
			System.out.println(points[1].y +" "+ points[1].x);
			return; 
		}

		if(allSame(points)){
			System.out.println("1"); 
			System.out.println(points[0].y +" "+ points[0].x);
			return; 
		}


		int L = 0; 

		for(int i = 1; i<n; i++)
			if(points[i].x < points[L].x)
				L = i;

		int p = L;
		int q; 
		ArrayList<Point> hull = new ArrayList<>(); 

		do{
			hull.add(points[p]); 

			q = (p+1)%n; 

			for(int i = 0; i<n; i++)
				if(orientation(points[p], points[i], points[q]) == 2)
					q = i; 

			p = q; 
		}
		while(p!=L); 

		System.out.println(hull.size()); 
		for(Point pt: hull){
			System.out.print(pt.x +" "+ pt.y);
			System.out.println(); 
		}
	}

	public static boolean allSame(Point p[]){
		int result1 = p[0].x;
		int result2 = p[0].y; 
		for(int i = 1; i<p.length; i++){
			result1 |= p[i].x;
			result2 |= p[i].y; 
		}

		if(result1 == p[0].x && result2 == p[0].y) 
			return true;

		   //System.out.println("false"); 
		return false;
	}

} 