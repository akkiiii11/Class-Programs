package lab_4;

class Shape2
{
	void draw()
	{
		
	}
	
	public double calculateArea()
	{
		return 0;
	}
}

class Circle2 extends Shape2
{
double radius;
	
	Circle2(double radius)
	{
		this.radius = radius;
	}
	
	void draw()
	{
		System.out.println("Drawing a circle");
	}
	
	public double calculateArea()
	{
		return 3.14 * radius * radius;
	}
}

class Cylinder extends Circle
{
	double height;
	
	Cylinder(double radius, double height)
	{
		super(radius);
		this.height = height;
	}
	
	void draw()
	{
		System.out.println("Drawing a Cylinder");
	}
	
	public double calculateArea()
	{
		return (2 * 3.14 * radius * height) + (2 * 3.14 * radius * radius) ;
	}
}

public class Shape2Main {

	public static void main(String[] args) {
		
		Circle2 sc = new Circle2(5);
		sc.draw();
		System.out.println("Area of a Circle is: " +sc.calculateArea());
		
		Cylinder s = new Cylinder(4, 9);
		s.draw();
		System.out.println("Area of a Cylinder is: " +s.calculateArea());
		

	}

}
