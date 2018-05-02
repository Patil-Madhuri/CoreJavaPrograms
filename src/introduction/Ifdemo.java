package introduction;

import java.util.Scanner;

public class Ifdemo {

	public static void main(String argv[])
	{
		String username = "coder";
		String password = "CODER";
		String u1,p1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the username");
		u1 = s.next();
		
		if(username.equals(u1))
		{
			
			System.out.println("Enter the password");	
			p1=s.next();
			if( password.equals(p1))
	
		{
			System.out.println("successful login");
		}
			else
			{
				System.out.println("Invalid password");	
			}
	    }
		System.out.println("Invalid username");
		
	}
}
