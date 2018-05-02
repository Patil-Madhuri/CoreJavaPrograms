package introduction;

import java.util.Scanner;

public class Table {

	public static void main(String args[])
	{
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		num = s.nextInt();
		for(int i = 1; i<=10; i++)
		{
			int num2 = num * i;
			System.out.println(+num + "*"  + i + "=" +num2);
			
		}
		
	}
}
 