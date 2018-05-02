package introduction;

import java.util.Scanner;

public class Fibonocies {

	public static void main(String args[])
	{
		int num,a=0,b=1,c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number= ");
		num = s.nextInt();
		
		for(int i=0;i<=num;i++)
		{
			System.out.println(a);
			c = a+b;
			a= b;
			b=c;
		}
	}
}
