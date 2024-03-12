package com.javacore.package1;

class Hospital1
{
	public void hospitalInfo()
	{
		System.out.println("Poona Hospital");
	}
}

class Doctor extends Hospital1
{
	public void doctorInfo()
	{
		System.out.println("Dr.Pooja worked in Poona Hospital");
	}
}

class Patient extends Hospital1
{
	public void patientInfo()
	{
		System.out.println("Aman patient admited in poona hospital");
	}
}

public class HierarchicalDemo {

	public static void main(String[] args) {
		
		Patient p = new Patient();
		p.patientInfo();
		p.hospitalInfo();

	}

}
