import java.util.Scanner;

public class Circle extends Point{
	
public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);
	 Point p1=new Point();
	 p1.x=sc.nextDouble();
	 p1.y=sc.nextDouble();
	 Point p2=new Point();
	 p2.x=sc.nextDouble();
	 p2.y=sc.nextDouble(); 
	 Circle c1=new Circle();
	System.out.print(c1.distance(p1,p2));
	
  }

}
class Point {
  double x,y;
  public double distance(Point p1,Point p2){
    double xDif=p1.x-p2.x;
    double yDif=p1.y-p2.y;
    return Math.sqrt(xDif*xDif+yDif*yDif);
  }
}
    
   