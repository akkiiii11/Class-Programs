package com.classdemo;

class PatientDetails // employee, car, college, Teacher, ABC
{
		//data member
		int patient_id;
		String patient_name;
		String patient_address;
		int patient_mobileno;
		
		//method member function
		public void storePatientData()
		{
			int id=0;		
			
			//body of method
			//write a logic to store the student id name address email
			
		}
		
		public void viewPatientData()
		{
			System.out.println("Patient Details are: ");
		}
		
		public void editPatientData()
		{
			
		}
		
//		public void viewOneStudentData()
//		{
//			System.out.println("One student record can fetch");
//		}
}

class DoctorDetails
{
	int doctor_id;
	String doctor_name;
	String doctor_address;
	int doctor_contact_no;
	
	public void storeDoctorData()
	{
		
	}
	
	public void viewDoctorData()
	{
		System.out.println("Doctor Details are: ");
	}
}

public class HospitalDemo {

	public static void main(String[] args) {
		
		PatientDetails obj = new PatientDetails();
		obj.viewPatientData();
		System.out.println("Patient Id: " +obj.patient_id);
//		System.out.println("Student Name: " +obj.student_name);	
		
		DoctorDetails obj2 = new DoctorDetails();
		obj2.viewDoctorData();
		System.out.println("Doctor Id: " +obj2.doctor_id);

	}

}
