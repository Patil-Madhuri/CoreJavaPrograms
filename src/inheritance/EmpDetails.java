
package inheritance;

import java.util.Scanner;

class Emp 
{
	int id;
	String name;
	Emp(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	void display()
	{
		System.out.println("Employee id= " +id);
		System.out.println("Employee name= " +name);
	}
}
public class EmpDetails extends Emp
{
	double salary;
	String location;
	int age;
	EmpDetails(int id, String name,double salary, String location, int age)
	{
		super(id,name);
		this.salary = salary;
		this.location = location;
		this.age = age;
	}
	void display()
	{
		super.display();
		System.out.println("Employee salary= " +salary);
		System.out.println("Employee locatin= " +location);
		System.out.println("Employee age= " +age);
	}
	public static void main(String[] args)
	 {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter id");
		int id = s.nextInt();
		System.out.println("Enter name");
		String name = s.next();
		System.out.println("Enter salary");
		double salary = s.nextDouble();
		System.out.println("Enter location");
		String location = s.next();
		System.out.println("Enter age");
		int age = s.nextInt();
		
		EmpDetails e = new EmpDetails(id,name,salary,location,age);
		e.display();
		
		s.close();
	}
}
