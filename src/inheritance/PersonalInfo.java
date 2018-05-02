package inheritance;

import java.util.Scanner;

class Student
{
	int id;
	String name;
	String address;
	Student(int id, String name, String address)
	{		this.id = id;
		this.name = name;
		this.address = address;
	}
	void display()
	{
		System.out.println("Student id= " +id);
		System.out.println("Student name= " +name);
		System.out.println("Student Address= " +address);
	}
	
}
class StudentDetails extends Student
{
	String dept;
	String hostel;
	StudentDetails(int id, String name,String address, String dept, String hostel)
	{
		super(id,name,address);
		this.dept = dept;
		this.hostel = hostel;
	}
	void display()
	{
		super.display();
		System.out.println("Student department= " +dept);
		System.out.println("Student hostel= " +hostel);
	}
}

public class PersonalInfo extends StudentDetails{
	static
	{
		System.out.println("*****Student Details*****");
	}
	long contact;
	String gender;
	PersonalInfo(int id, String name,String address, String dept, String hostel,long contact,String gender)
	{
		super(id,name,address,dept,hostel);
		this.contact = contact;
		this.gender = gender;
	}
	void display()
	{
		super.display();
		System.out.println("Student Contact= " +contact);
		System.out.println("Student gender= " +gender);
	}
	

	public static void main(String[] args) 
	{
	 Scanner s = new Scanner(System.in);
	 System.out.println("Enter id");
	 int id = s.nextInt();
	 System.out.println("Enter name");
	 String name = s.next();
	 System.out.println("Enter Address");
	 String address = s.next();
	 System.out.println("Enter Department");
	 String dept = s.next();
	 System.out.println("Enter Hostelinfo");
	 String hostel = s.next();
	 System.out.println("Enter Contact no");
	 long contact = s.nextLong();
	 System.out.println("Enter gender");
	 String gender = s.next();
	 
	 PersonalInfo p = new PersonalInfo(id,name,address,dept,hostel,contact,gender);
	 p.display();
		
	}
}
