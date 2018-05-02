package introduction;

import java.util.Scanner;

public class Switch {

	public static void main(String args[])
	{
		int a=10,b=20,result,ch;
		do
		{
		System.out.println("1: Addition \n2:Substraction \n3: Multiplication \n4: Division \n5:Exit");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your choice");
		 ch = s.nextInt();
		 //System.out.println("Thank You For Visiting");
		
		switch(ch)
		{
		case 1:
			 result = a + b;
			 System.out.println(result);
			 break;
		case 2:
			 result = a - b;
			 System.out.println(result);
			 break;
		case 3:
			 result = a * b;
			 System.out.println(result);
			 break;
		case 4:
			 result = a / b;
			 System.out.println(result);
			 break;
		case 5:
			System.out.println("Thank You For Visiting");
			System.exit(0);
		
		default:
			System.out.println("you have enterd wrong choice");
		}
		
		}while(ch > 0);
		
	}
}
