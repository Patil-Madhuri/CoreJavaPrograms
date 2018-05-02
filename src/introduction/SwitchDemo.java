package introduction;

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String args[])
	{
		int year,ch;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the year= ");
		year = s.nextInt();
		do{
		System.out.println("1.Jan \n2 Feb \n3.Mar \n4.Apr \n5.May \n6.Jun \n7.July \n8.Aug \n9.Sep \n10.Oct \n11.Nov \n12.Dec \n13.exit");
		
		
		System.out.println("Enter your choice");
		ch = s.nextInt();
		

		switch(ch)
		{
		case 2 :
			if(year % 4 == 0)
			{
				System.out.println("No of days=29");
			}
			else
			{
				System.out.println("No of days=28");
			}
			break;
		case 3:
		case 1:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("No of days= 31");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("No of days=30");
			break;
		case 13:
			System.exit(0);
		default:
			System.out.println("you have enterd wrong choice");
		
		}
		}while(ch > 0);
	}

}
