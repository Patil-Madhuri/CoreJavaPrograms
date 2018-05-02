package introduction;

import java.util.Scanner;

public class Prime {
	public static void main(String argv[])
	{
		int num,i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the num= ");
		num = s.nextInt();
	
		for( i=2; i<=num; i++)
		{
			if(num % i == 0)
			{
				break;
			}
		}
		if(num == i)
		{
			System.out.println("number is prime");
		}
		else
		{
			System.out.println("number is not prime");
		}
	}
}

