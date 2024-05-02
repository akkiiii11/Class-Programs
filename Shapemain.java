package lab_4;

class Shape
{
	void draw()
	{
		
	}
	
	public double calculateArea()
	{
		return 0;
	}
}

class Circle extends Shape
{
	double radius;
	
	Circle(double radius)
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

class Square extends Shape
{
	double side;
	
	Square(double side)
	{
		this.side = side;
	}
	
	void draw()
	{
		System.out.println("Drawing a Square");
	}
	
	public double calculateArea()
	{
		return side * side;
	}
}

class Triangle extends Shape
{
	double height;
	double width;
	
	Triangle(double height, double width)
	{
		this.height = height;
		this.width = width;
	}
	
	void draw()
	{
		System.out.println("Drawing a Triangle");
	}
	
	public double calculateArea()
	{
		return 0.5 * height * width;
	}
}

public class Shapemain {

	public static void main(String[] args) {
		
		Circle sc = new Circle(4);
		sc.draw();
		System.out.println("Area of a Circle is: " +sc.calculateArea());
		
		Square ss = new Square(4);
		ss.draw();
		System.out.println("Area of a Square is: " +ss.calculateArea());
		
		Triangle st = new Triangle(4,5);
		st.draw();
		System.out.println("Area of a Triangle is: " +st.calculateArea());

	}

}
