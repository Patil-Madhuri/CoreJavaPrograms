package extraTask;

import java.util.Scanner;

public class Pizza {
	static
	{
		System.out.println("*****Hotel*****");
	}
	int tbill,bill;
	Pizza(int a)
	{
		this.bill = tbill;
	}
	
	
	
	public static void main(String args[])
	{ 
	
		Scanner s = new Scanner(System.in);
		int ch;
		int tbill=0,bill=0,qty,bill1 = 0,bill2=0,bill3=0;
		do
		{
		System.out.println("1.Cheese Pizza: Rs.100 \n2.Pan Pizza:     Rs.120 \n3.Regular Pizza: Rs.140 \n4.Total Bill \n5.Exit");
		System.out.println("Enter choice");
		ch = s.nextInt();
		
		
		switch(ch)
		{
		case 1:
			System.out.println("Enter Quantity=");
			qty = s.nextInt();
			bill1 = 100 * qty;
	
			break;
		case 2:
			System.out.println("Enter Quantity=");
			qty = s.nextInt();
			 bill2 = 120 * qty;
	
			break;
		case 3:
			System.out.println("Enter Quantity=");
			qty = s.nextInt();
			 bill3 = 140 * qty;
	
			break;
		case 4:
			bill = bill1 + bill2 + bill3;
			System.out.println("Your total bill= " +bill);
	
			break;
		case 5:
	
			System.out.println("Your total bill= " +bill);
			System.out.println("Thank you for visiting...");
			System.out.println("Visit Again...");
			System.exit(0);
		default:
			System.out.println("You entered wrong choice");
		}
	}while(ch>0);
	}
	

}
