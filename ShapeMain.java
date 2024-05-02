package lab_5;

abstract class Shape
{
	double a;
	
	public Shape(double a) {
		super();
		this.a = a;
	
	}

	abstract double calculateArea();
	
	abstract double calculatePerimeter();
}

class Circle extends Shape
{

	public Circle(double a) {
		super(a);
	}

	@Override
	double calculateArea() {
		
		return 3.14 * a * a;
	}

	@Override
	double calculatePerimeter() {
		
		return 2 * 3.14 * a ;
	}
	
}

class Triangle extends Shape
{
	double b;
	double c;

	public Triangle(double a, double b, double c) {
		super(a);
		this.b = b;
		this.c = c;
				
	}

	@Override
	double calculateArea() {
		
		return 0.5 * a * b;
	}

	@Override
	double calculatePerimeter() {
		
		return a + b + c;
	}
	
}

public class ShapeMain {

	public static void main(String[] args) {

		Circle sc = new Circle(5);
		
		System.out.println("Area of Circle: " +sc.calculateArea()+ " sq.meter");
		System.out.println("Perimeter of Circle: " +sc.calculatePerimeter()+ " meter");
		
		System.out.println();
		
		Triangle st = new Triangle(5, 3, 2);
		
		System.out.println("Area of Circle: " +st.calculateArea()+ " sq.meter");
		System.out.println("Perimeter of Circle: " +st.calculatePerimeter()+ " meter");
		
	}

}
