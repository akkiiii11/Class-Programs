package com.classdemo;

class StudentDetails // employee, car, college, Teacher, ABC
{
		//data member
		int student_id;
		String student_name;
		String student_addreess;
		String student_email;
		float student_marks;
		
		//method member function
		public void storeData()
		{
			int id=0;
			
			//body of method
			//write a logic to store the student id name address email
			
		}
		
		public void viewstudentdata()
		{
			
		}
		
		public void editstudentdata()
		{
			
		}
		
		public void viewOneStudentData()
		{
			System.out.println("One student record can fetch");
		}
		
		public void marksofstudent()
		{
			
		}
}

public class ClassSample {

	public static void main(String[] args) {
		
		StudentDetails obj = new StudentDetails();
		obj.viewstudentdata();
		System.out.println("Student Id: " +obj.student_id);
//		System.out.println("Student Name: " +obj.student_name);
		obj.marksofstudent();
		
		StudentDetails obj2 = new StudentDetails();
		
		StudentDetails obj3 = new StudentDetails();
		
		StudentDetails obj4;
		
	}

}
