package introduction;

import java.util.Scanner;

public class Armstrong {

	public static void main(String argv[])
	{
		int num = 371,rem,result=0,orginal;
		orginal = num; 
		while(num > 0)
		{
			 
			 rem = num % 10;
			 result = rem * rem *rem +result;
			 num = num / 10;
		}
		if(orginal == result)
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Number is not Armstrong");
		}
	}
}
