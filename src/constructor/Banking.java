package constructor;

import java.util.Scanner;

public class Banking 
{
	static
	{
		System.out.println("BankAppliction");
	}
	{
		System.out.println("*****Services*****");
	}
	double bal;
	Banking(double bal)
	{
		this.bal= bal;
	}
	
	public Banking() {
		
	}

	void withdraw(double amtw)
	{		
		bal = bal - amtw;
		System.out.println("You Withdraw=" +amtw +"New balance=" +bal);
		
	}
	
	void balance()
	{
		System.out.println("Balance= " +bal);
	}
	
	void deposit(double amtd)
	{
		bal = bal + amtd;
		System.out.println("You deposit=" +amtd +"New balance=" +bal);
		
	}
	
	public static void main(String args[])
	{  
		int ch;double bal=5000;
		Scanner s = new Scanner(System.in);
		 Banking b = new Banking(bal);
		do{
			
		System.out.println("1.Withdraw \n2.Deposit \n3.Balance \n4. Exit");
		System.out.println("Enter your Choice");
		 ch = s.nextInt();
		
		
		switch(ch)
		{
		case 1:
			 Banking b1 = new Banking();
			System.out.println("Enter amount= ");
		    double amtw = s.nextDouble();
		    b.withdraw(amtw);
		    break;
		case 2:
			Banking b2 = new Banking();
			System.out.println("Enter amount= ");
		    double	amtd = s.nextDouble();
		    b.deposit(amtd);
		    break;
		case 3:
			
			Banking b3 = new Banking();
			b.balance();
			break;
		case 4:
			System.out.println("Thank you");
			System.exit(0);
		default:
			System.out.println("You Entered Wrong choice");
		}
		}while(ch > 0);
	}
}
