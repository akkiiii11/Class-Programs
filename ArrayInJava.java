package com.javacore.class_program;

public class ArrayInJava {

	public static void main(String[] args) {
		
		int[] a= {12,21,0,5,7};
		int[] b=new int[a.length]; //Declaring and instantiating another veriable 
		

		for(int i=0;i<a.length;i++) //coping a array variable in b[i]
		{
			b[i]=a[i];				//  i=1 1<5
									//  b[1] = a[1]
									//  b[0] = 12
									//  b[1] = 21
		}
		a[2]=56;		//Changing value of 3rd element in array 'a'
		System.out.println(b[2]);		//value of 3rd element in array 'b'
		
	}

}
