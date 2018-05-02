package introduction;

import java.util.Scanner;

public class Palindrome {

	public static void main(String args[])
	{
		int num,rev=0,result;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number=");
		num = s.nextInt();
		result = num;
		while(num > 0)
		{
			rev = rev * 10;
			rev = num % 10 + rev;
			num = num / 10;			
		}
		if(rev==result)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
	}
}
