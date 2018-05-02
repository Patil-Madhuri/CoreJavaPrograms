package introduction;

import java.util.Scanner;

public class Ifloop {

public static void main(String args[])
{
	String username;
	String un="CODER";
	Scanner s = new Scanner(System.in);
	System.out.println("Enter username= ");
	username= s.next();
	if(un.equals(username))
	{
		System.out.println("Valid Username..!!!");
	}
	else
	{
		System.out.println("Invalid Username..!!!");
	}
	
	
}
}
