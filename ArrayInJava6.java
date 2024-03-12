package com.javacore.class_program;

public class ArrayInJava6 {

	public static void main(String[] args) {

		double[][] matrix = {	//declaration, instatiation and intilization of double
				{1.2,4.3,4.0},
				{4.1,1.1},
				{2.3}
		};
		
		/*
				column1			column2			column3
					1				2				3
		row1	matrix[0][0]	matrix[0][1]	matrix[0][2]
		row2	matrix[1][0]	matrix[1][1]	matrix[1][2]
		row1	matrix[2][0]	matrix[2][1]	matrix[3][2]
		
			matrix[0][0] = 1.2
			matrix[1][1] = 1.1
			matrix[2][0] = 2.3
		
		double[][] matrix1;	//declaration of two dimentinal array
		
		double[][] a = new double[3][2];	//instatiation
		
		int[][] a1 = new int[3][2];
		String[][] a2 = new String[3][2];*/
		
		int[][] a = {
				{1,2,3},
				{4,5,6,9},
				{7}
		};
		
		System.out.println("Length of row 1" +a[0].length); //3
		System.out.println("Length of row 2" +a[1].length); //4
		System.out.println("Length of row 3" +a[1].length); //1
		System.out.println(a[1][2]); //6
		System.out.println(a[0][0]); //1
		System.out.println(a[0][1]); //2
		System.out.println(a[0][2]); //3
		System.out.println(a[1][0]); //4
		System.out.println(a[1][1]); //5
		System.out.println(a[1][3]); //9
		System.out.println(a[2][0]); //7
		
	}

}
