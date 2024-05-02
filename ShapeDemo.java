package com.corejava.lab_3;

class Rectangle
{
	int width;
	int height;
	
	Rectangle(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	
	public int getArea()
	{
		int area = width * height;
		return area;
	}
	
}

public class ShapeDemo {

	public static void main(String[] args) {

		Rectangle rect = new Rectangle(50, 30);
		
		System.out.println("Area of a Rectangle: "+rect.getArea());
		
	}

}
