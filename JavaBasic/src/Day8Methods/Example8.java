package Day8Methods;

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		double area, pi=3.14;
//		int r=10;
//		area=pi*r*r;
//		System.out.println("Radius is: "+r);
//		System.out.println("Area of circle is : "+area);
//		printAreaOfCircle(10);
//		printAreaOfCircle(50);
//		printAreaOfCircle(75);
		
		pritnAreaOfRectangle(15, 10);
		
		System.out.println("Area: "+pritnAreaOfRectangle(10, 15));
		
		double res=pritnAreaOfRectangle(10, 15);
		System.out.println(res);
	}

	//method for getting area of circle -- area= pi*r*r
	static void printAreaOfCircle(int r) {
		double area, pi=3.14;
		area=pi*r*r;
		System.out.println("Radius is: "+r);
		System.out.println("Area of circle is : "+area);
	}
	//method for getting area of rectangle
	static double pritnAreaOfRectangle(int l,int w) {
		double area=l*w;
		System.out.println("l: "+l);
		System.out.println("w: "+w);
		return area;
	}
}
