package inheritance;

import java.util.Scanner;

public class Sample 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter id=");
		int id = s.nextInt();
		System.out.println("Enter Name=");
		String name = s.next();
		System.out.println("Enter Location=");
		String location = s.next();
		
		Person p = new Person(id,name,location);
		/*
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getLocation());
		*/
		System.out.println(p);
		s.close();
	}
}
