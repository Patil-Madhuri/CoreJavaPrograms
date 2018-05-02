package introduction;

import java.util.Scanner;

public class Atm {
	public static void main(String args[]){
		String pin = "123";
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the pin");
		String pin1 = s.next();
		
		
		if(pin.equals(pin1))
		{
			int ch = 0,d=0,amt=0;
			int bal = 60000;
			do{
			

			System.out.println("1.Withdraw \n2.Balance \n3.Deposit" );
			System.out.println("Enter choice");
			ch = s.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter amount");
				amt = s.nextInt();
				if(amt >= bal)
				{
					System.out.println("Insufficnt bal");
					int r = amt - bal;
					System.out.println("You require amount="  +r);
				}
				else
				{
				bal = bal - amt;
				System.out.println("New balance=" +bal);
				}
				break;
			case 2:
				
				System.out.println(bal);
				break;
			case 3:
				System.out.println("Enter amount");
				d = s.nextInt();
				bal = bal + d;
				System.out.println("New balance=" +bal);
				break;
			
			default:
			}
			
			}while(ch > 0);
		}
		else
		{
			System.out.println("password incorrect");
		}
	
		}
	}


