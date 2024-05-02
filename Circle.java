package com.corejava.lab_2;

public class Circle {

public void calAreaCircum(int r) {
		
		int area = (int) (3.14 * r* r);
		System.out.println("Area of a Circle: " +area);
		
		int circumference = (int) (2 * 3.14 * r);
		System.out.println("Circumference of a Circle: " +circumference);
	}
	

	public static void main(String[] args) {

		Circle c = new Circle();
		
		c.calAreaCircum(5);

	}

}
