package com.corejava.lab_2;

public class Rectangle {

void calAreaPerimeter(int width, int height) {
		
		int area = width*height;
		System.out.println("Area of a Rectangle: " +area);
		
		int perimeter = 2 *(width + height);
		System.out.println("Perimeter of a Rectangle: " +perimeter);
	}


	public static void main(String[] args) {
		
		Rectangle rect = new Rectangle();
		
		rect.calAreaPerimeter(50, 30);

	}

}
