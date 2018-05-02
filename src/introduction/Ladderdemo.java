package introduction;

import java.util.Scanner;

public class Ladderdemo {

	public static void main(String[] args) {
		double marks;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter marks=");
		marks = s.nextDouble();
		if(marks < 35)
		{
			
			System.out.println("Failed");
			
		}
		else if(35 >= marks && marks < 55 )
		{
			System.out.println("pass class");
		}
		else if(56 > marks && marks < 65 )
		{
			System.out.println("second class");
		}
		else if(66 > marks && marks < 75 )
		{
			System.out.println("first class");
		}
		
		else
		{
			System.out.println("Destinction");
		}

	}

}
