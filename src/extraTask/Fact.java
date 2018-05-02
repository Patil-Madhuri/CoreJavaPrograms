package extraTask;

import java.util.Scanner;

public class Fact {
	public static void main(String args[])
	{
		int fact = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		
		for(int i=1; i<=num; i++)
		{
			fact = fact * i;
		}
		
		System.out.println(fact);
	}

}
